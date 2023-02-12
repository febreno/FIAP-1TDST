import React from 'react'
import ImgBot from '../../img/chatBot.png'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import './ChatBot.css'

export default () =>{
    return(
        <>
        <Header/>
        <main>
            <h1>Chat bot</h1>
            <div class="cardChat">
                <div class="userBot">
                    <img src={ImgBot} alt=""/>
                    <div class="desc">
                        <h3>WorkfyBot</h3>
                    <p>AI Help Assitent Bot</p>
                    </div>
                </div>
                <div class="message">
                    <p>Ola eu sou o Workfybot com Inteligencia Antificial</p>
                </div>
                <div class="messageUser">
                    <p>Quais vagas combinam comigo?</p>
                </div>
                <div class="message">
                    <p>Vagas de Ads, voltadas ao web desenvolvimento se enquadram com seu perfil!</p>
                </div>
            </div>
            <div class="sendMessage">
            <input type="text"/>
                <i class="bx bx-send nav__icon"></i>
            </div>
        </main>
        <Footer/>
        </>
    )
}