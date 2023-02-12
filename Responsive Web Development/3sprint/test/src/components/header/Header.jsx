import React from 'react'
import './Header.css'
// const { useEffect, useRef } = React;
import Menu from '../../menu';
import openMenu from '../../menu';
// import { default as DefaultExport } from '../../content.js'

export default () =>{
    return(
        <div>
            <header>
                <a href="#" className="btn-abrir">&#9776;</a>{/*onclick={openMenu()}*/}
            </header>
            <nav id="menu">
                <a className="invisible">&#9776;</a>{/*onclick={closeMenu()}*/}
                <div className="menuNav">
                    <a href="home.html">
                        <i className='bx bx-grid-alt nav__icon'></i>
                        <span className="home">Home</span>
                    </a>
                </div>
                <div className="menuNav">
                    <a href="perfil.html">
                        <i className='bx bx-user nav__icon'></i>
                        <span className="home">Perfil</span>
                    </a>
                </div>
                <div className="menuNav">
                    <a href="contratacao.html">
                        <i className='bx bx-dock-top nav__icon'></i>
                        <span className="sobresite">Contratacao</span>
                    </a>
                </div>
                <div className="menuNav">
                    <a href="Users.html">
                        <i className='bx bx-group nav__icon'></i>
                        <span className="home">Usuarios</span>
                    </a>
                </div>
                <div className="menuNav">
                    <a href="chatBot.html">
                        <i className='bx bx-message-rounded nav__icon'></i>
                        <span className="contato">Chatbot</span>
                    </a>
                </div>
                <div className="menuNav">
                    <a href="about.html">
                        <i className='bx bxs-info-circle nav__icon'></i>
                        <span className="sobresite">Informações/dicas</span>
                    </a>
                </div>
                <div className="menuNav">
                    <a href="login.html">
                        <i className='bx bxs-log-out nav__icon'></i>
                        <span className="sobresite">Logout</span>
                    </a>
                </div>
                <label className="theme-switch" for="checkbox">
                    <a>
                        <input id="checkbox" type="checkbox"></input>
                        <span className="whitemode">Dark-mode</span>
                    </a>
                </label>
            </nav>
        </div>   
    )
}
