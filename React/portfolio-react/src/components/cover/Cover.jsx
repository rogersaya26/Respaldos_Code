import React from 'react'
import "./Cover.css"
import nightLife from "../media/nightLife.gif";


const Cover = () => {
    return (
        <div className="cover-container">
            <img className="bg-cover" src={nightLife} />
            <h1>My Portfolio</h1>
            <p>Developer | React | Java</p>
        </div>
    )
}

export default Cover
