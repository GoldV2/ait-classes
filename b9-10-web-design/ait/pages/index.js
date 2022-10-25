import { Fragment, useState } from "react";
import Carousel from "../components/carousel/carousel";
import About from "../components/info/about/about";
import Card from "../components/info/about/card";
import Opportunities from "../components/info/opportunity/opportunities";

export default function Home(props) {
  const cards = [
    {
      id: 1,
      title: "About",
      description:
        "Here you can read what AIT is really about. Get to know our mission statement and how we give back to our community",
    },
    {
      id: 2,
      title: "Opportunities",
      description:
        "Here you can read about all the amazing opportunities you can have as a student at AIT",
    },
    {
      id: 3,
      title: "How to Apply",
      description:
        "Here you will learn all the ins-and-outs of the application process to AIT",
    },
    {
      id: 4,
      title: "Contact",
      description:
        "Here you will find information on all staff and their contact.",
    },
  ];

  const [currentPage, setCurrentPage] = useState("About");

  return (
    <div>
      <div className="mt-5">
        <div className="container">
          <div className="row">
            <div className="col-md-8">
              <Carousel carousels={props.carousels} />
              <div className="mt-3 p-5 bg-light rounded-3">
                <h1 className="text-center">{currentPage}</h1>
              </div>
            </div>
            <div className="col-md-4 row">
              {cards.map((card) => (
                <Card
                  key={card.id}
                  title={card.title}
                  description={card.description}
                  id={card.id}
                  setCurrentPage={setCurrentPage}
                />
              ))}
            </div>
          </div>
        </div>
      </div>

      {currentPage === "About" && <About carousels={props.carousels}></About>}
      {currentPage === "Opportunities" && (
        <Opportunities carousels={props.carousels}></Opportunities>
      )}
    </div>
  );
}

export async function getStaticProps() {
  return {
    props: {
      carousels: [
        {
          id: 1,
          link: "images/image1.jpg",
        },
        { id: 2, link: "images/image2.jpg" },
      ],
    },
  };
}
