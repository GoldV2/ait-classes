rushing_yards <- c(163, 112, 128, 104, 96, 133, 132, 84, 141, 108, 105, 129, 116, 116, 113, 190)
points_scored <- c(16, 3, 10, 10, 20, 13, 12, 14, 17, 10, 13, 14, 41, 14, 17, 19)

cr <- function(x,y){
    n <- length(x)
    yl <- length(y)
    xy <- x * y
    sx <- sum(x)
    sy <- sum(y)
    sxy <- sum(xy)
    x2 <- x ^ 2
    y2 <- y ^ 2
    sx2 <- sum(x2)
    sy2 <- sum(y2)
    r <- ((n*sxy) - (sx * sy)) / (sqrt((((n*sx2)-(sx^2)) * ((n*sy2)-(sy^2)))))
    return(r)
}

csd <- function(a, t) {
  squared_sum <- csquared_sum_of_mean_dif(a)
  sd <- sqrt(squared_sum/(length(a)-t))
  return(sd)
}

csquared_sum_of_mean_dif <- function(a) {
  sum <- 0
  mean <- cmean(a)
  for (val in a) {
    sum <- sum + (val-mean)^2
  }
  return(sum)
}

cmean <- function(a) {
  return(sum(a)/length(a))
}

# slope
b1 <- cr(rushing_yards, points_scored)*csd(points_scored, 1)/csd(rushing_yards, 1)
# y-intercept
b0 <- mean(points_scored) - b1*mean(rushing_yards)

print(paste("y = ", b0, " + ", b1, "x", sep=""))

res <- c()
for (i in 1:length(points_scored)) {
  res <- append(res, (points_scored[i]*b1+b0)-points_scored[i])
}

r <- cr(rushing_yards, points_scored)
plot(rushing_yards, res,
main = paste("r-value:", round(r, digits=3), "r^2-value", round(r^2, digits=3), "SD of res:", round(csd(res, 2), digits=3)),
     xlab = "Points Scored",
     ylab = "Residuals")
