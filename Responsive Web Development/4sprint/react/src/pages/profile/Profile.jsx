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
            <h1>Candidato/Recrutador</h1>
            <h2>Etapas Contratacao</h2>
            <TimeLine/>
            <h2>Perfis Cadastratros em vagas</h2>
            <CardUser/>
            <CardUser/>
        </main>
        <Footer/>
        </>
    )
}