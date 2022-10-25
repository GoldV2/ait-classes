export default function CarouselItem(props) {
  return (
    <div className={"carousel-item " + (props.id === 1 ? "active" : null)}>
      <img src={props.link} className="d-block w-100 rounded-3" alt="..." />
    </div>
  );
}
