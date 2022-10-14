import React from 'react'
import Header from '../../components/header/index'
import ModelH from '../../components/models/modelH'
import Jd6psg from '../../img/jd6psg.png'
import Footer from '../../components/footer/index'

import '../pages.css'

export default () =>{
    return(
        <>
            <div class="content">
                <h1>Home</h1>
                <div class="banner">
                    <img src={Jd6psg}/>
                </div>
                <ModelH/>
            </div>
            <Footer/>
        </>
    )
}