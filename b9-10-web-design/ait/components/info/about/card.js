export default function Card(props) {

  return (
    <div className="col-12 mb-2">
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">{props.title}</h5>
          <p clas="card-text">
            {props.description}
          </p>
          <input
            type="radio"
            class="btn-check"
            name="options"
            id={"option " + props.id}
            autocomplete="off"
            onClick={() => props.setCurrentPage(props.title)}
          />
          <label class="btn btn-secondary" for={"option " + props.id}>
            Read
          </label>
        </div>
      </div>
    </div>
  );
}
