import React from 'react'
import Header from '../../components/header/index'
import homem from '../../img/homem.png'
import ModelBase from '../../components/models/modelBase'
import Footer from '../../components/footer/index'
import '../pages.css'

export default () =>{
    return(
        <>
            <div class="content">
                <h1>Moda Masculina</h1>
                <div class="banner">
                    <img src={homem}/>
                </div>
                <ModelBase/>
            </div>
            <Footer/>
        </>
    )
}