import React from 'react'
import Card1 from '../../img/cardM1.png'
import Card2 from '../../img/cardM2.png'
import './model.css'

export default () =>{
    return(
        <>
            <h2>Models</h2>
            <div class="cards">
                <div class="card">
                    <img src={Card1}/>
                    <h3>bunny</h3>
                    <p>Increadible t-shirt for developers</p>
                </div>
                <div class="card">
                    <img src={Card2}/>
                    <h3>iceberg</h3>
                    <p>Increadible t-shirt for developers</p>
                </div>
            </div>
        </>
    )
}