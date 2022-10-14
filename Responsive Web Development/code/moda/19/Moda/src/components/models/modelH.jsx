import React from 'react'
import Card1 from '../../img/cardH1.png'
import Card2 from '../../img/cardH2.png'
import Card3 from '../../img/cardH3.png'
import Card4 from '../../img/cardH4.png'
import './model.css'

export default () =>{
    return(
        <>
        <h2>Models</h2>
        <div class="cards">
            <div class="card">
                <img src={Card1}/>
                <h3>2010</h3>
            </div>
            <div class="card">
                <img src={Card2}/>
                <h3>2020</h3>
            </div>
            <div class="card">
                <img src={Card3}/>
                <h3>2022</h3>
            </div>
            <div class="card">
                <img src={Card4}/>
                <h3>2030</h3>
            </div>
        </div>
        </>
    )
}