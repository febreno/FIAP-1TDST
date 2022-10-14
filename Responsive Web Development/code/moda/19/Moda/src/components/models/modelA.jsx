import React from 'react'
import Co1 from '../../img/coInStyle1.png'
import Co2 from '../../img/coInStyle2.png'
import './model.css'

export default () =>{
    return(
        <>
            <h2>COs</h2>
            <div class="cards">
                <div class="card">
                    <img src={Co1}/>
                    <h3>Pichai</h3>
                    <p><strong>Pichai Sundararajan</strong>, known as Sundar Pichai is the current CEO of Google and Alphabet. Pichai was chosen as the company's CEO on August 10, 2015, replacing Larry Page following the opening of Alphabet Inc.</p>
                </div>
                <div class="card">
                    <img src={Co2}/>
                    <h3>Elon</h3>
                    <p><strong>Elon Reeve Musk</strong> is a South African-Canadian, American-born entrepreneur and philanthropist. He is the founder, chief executive officer and technical director of SpaceX; CEO of Tesla, Inc.; vice president of OpenAI, founder and CEO of Neuralink; co-founder and president of SolarCity</p>
                </div>
            </div>
        </>
    )
}