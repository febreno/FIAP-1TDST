import React from 'react'
import Header from '../../components/header/index'
import Logo from '../../components/logo/index'
import ModelA from '../../components/models/modelA'
import Footer from '../../components/footer/index'
import '../pages.css'

export default () =>{
    return(
        <>
            <div class="content">
                <h1>Sobre</h1>
                <Logo/>
                <ModelA/>
            </div>
            <Footer/>
        </>
    )
}