import React from 'react'
import Header from '../../components/header/index'
import ModelBase from '../../components/models/modelBase'
import Mulher from '../../img/mulher.png'
import Footer from '../../components/footer/index'
import '../pages.css'

export default () =>{
    return(
        <>
            <div class="content">
                <h1>Moda Feminina</h1>
                <div class="banner">
                    <img src={Mulher}/>
                </div>
                <ModelBase/>
            </div>
            <Footer/>
        </>
    )
}