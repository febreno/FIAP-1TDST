import React from 'react'
import TimeLine from '../../components/timeLine/TimeLine'
import CardUser from '../../components/cards/CardUser'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'

export default () =>{
    return(
        <>
        <Header/>
        <main>
            <h1>Contratacao</h1>
            <TimeLine/>
            <CardUser/>
            <CardUser/>
        </main>
        <Footer/>
        </>
    )
}