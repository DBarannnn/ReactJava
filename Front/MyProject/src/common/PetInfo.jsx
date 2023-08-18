import "./PetInfo.css";

export default function PetInfo(props) {
  return (
    <div className="container-pet">
      <img src={props.item.image} alt="" className="pet-img" />
      <div className="container-pet-details">
        <p className="pet-info">Name: {props.item.name}</p>
        <p className="pet-info">Age: {props.item.years + ' years' + ', ' + props.item.months + ' months'}</p>
        <p className="pet-info">Description: {props.item.description}</p>
      </div>
    </div>
  );
}
