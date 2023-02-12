import React from 'react'
import CardUser from '../../components/cards/CardUser'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'

export default () =>{
    return(
        <>
        <Header/>
        <main>
            <h1>Adm e Recrutadoes poderao vizualizar perfis</h1>
            <CardUser/>
            <CardUser/>
            <CardUser/>
        </main>
        <Footer/>
        </>
    )
}