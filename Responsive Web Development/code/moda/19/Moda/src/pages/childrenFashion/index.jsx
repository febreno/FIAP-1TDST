import React from 'react'
import Header from '../../components/header/index'
import Banner from '../../img/cardI1.png'
import ModelBase from '../../components/models/modelBase'
import Footer from '../../components/footer/index'
import '../pages.css'


export default () =>{
    return(
        <>
            <div class="content">
                <h1>Moda Infantil</h1>
                <div class="banner">
                    <img src={Banner}/>
                </div>
                <ModelBase/>
            </div>
            <Footer/>
        </>
    )
}