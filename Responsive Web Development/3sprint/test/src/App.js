import React from 'react'
import './App.css'
import Header from './components/header/Header'
import Footer from './components/footer/Footer'
import Home from './pages/home/Home'
import Profile from './pages/profile/Profile'
import Contractation from './pages/contractation/Contractation'
import ChatBot from './pages/chatBot/ChatBot'
import Login from './pages/Access/Login'
import Register from './pages/Access/Register'
import Informacoes from './pages/information/Information'

export default () =>{
    return(
        <>
            <Header/>
            <main>
                {/* pages here! */}
                <Informacoes/>
            </main>
            <Footer/>
        </>
    )
}