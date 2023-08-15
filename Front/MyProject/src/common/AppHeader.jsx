import React from "react";
import "./AppHeader.css";

export default function(){
    return(
        <header className="header">
            <div className="brand">
                <p className="brand-text">Pet 2 Pet</p>
                <img src="src/assets/dogcat.png" alt="dog and cat logo" className="brand-img"/>
            </div>
        </header>
    )
}