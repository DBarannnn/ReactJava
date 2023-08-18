import "./Home.css";
import PetInfo from "./PetInfo";
import {fetchHomePets} from "../helper/ApiCalls"
import React, { useState, useEffect } from "react";

export default function Home(){
   
        const [pets, setPets] = useState([]);
    
        useEffect(() => {
          console.log("In use effect")
            fetchHomePets(5)
              .then(response => {
                console.log("Fetched pets:", response);
                setPets(response);
              })
              .catch(error => console.error("Error fetching home pets:", error));
        }, []);
    

    return(
        <div className="home-container">
            <h2 className="home-heading">Welcome to Pet 2 Pet Community!</h2>
            <p className="home-text">We've positively impacted the lives of over 1 million individuals through
             our innovative platform, where caring hearts come together to provide mutual pet care and support. </p>
            <p className="home-heading">About us</p>
            <p className="home-text">At Pet 2 Pet, we believe in the power of a helping
             hand and a caring heart. Our platform is designed to bring people closer
              by fostering trust, empathy, and a sense of responsibility.
               Whether you're a devoted pet owner seeking a reliable companion for your furry
                friend or someone eager to lend a hand and shower another pet with affection, you're in the right place.</p>
             <hr className="home-separator"></hr>
              <h3 className="home-heading">Our pets</h3>
              {pets.map(pet => {
                return <PetInfo key={pet.id} item={pet} />;
              })}
            
        </div>
    )
}