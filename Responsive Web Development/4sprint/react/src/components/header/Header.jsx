import React, {useState} from 'react'
import styled from 'styled-components';
import './Header.css'
// const { useEffect, useRef } = React;
import {Link} from 'react-router-dom'
// import Menu from '../../menu';
// import openMenu from '../../menu';
// import { default as DefaultExport } from '../../content.js'

export default function(){

    var [c,showMenu]=useState(0)
    var Menu = styled.nav`width: 0px;`
    if(c%2==0){//c%2==0
        Menu = styled.nav`width: 0px;`
    }
    if(c%2!=0){
        Menu = styled.nav`width: 210px;`
    }
    return(
        <div>
            {c==2? showMenu(c=0) :''}
            <header>
                <a href="#" className="btn-abrir" onClick={()=>showMenu(c+1)}>&#9776;</a>
                {/* <button onClick={()=>setValue(value = 1)}></button> */}
            </header>
            <Menu>
                    <a className="invisible" onClick={()=>showMenu(c+1)}>&#9776;</a>
                    <div className="menuNav">
                        <Link to='/'>
                            <i className='bx bx-grid-alt nav__icon'></i>
                            <span>Home</span>
                        </Link>
                    </div>
                    <div className="menuNav">
                        <Link to='/Profile'>
                            <i className='bx bx-user nav__icon'></i>
                            <span>Profile</span>
                        </Link>
                    </div>
                    <div className="menuNav">
                        <Link to='/Contractation'>
                            <i className='bx bx-dock-top nav__icon'></i>
                            <span>Contratacao</span>
                        </Link>
                    </div>
                    <div className="menuNav">
                        <Link to='/Profile'>
                            <i className='bx bx-group nav__icon'></i>
                            <span>Perfil</span>
                        </Link>
                    </div>
                    <div className="menuNav">
                        <Link to='/Users'>
                            <i className='bx bx-group nav__icon'></i>
                            <span>Usuarios</span>
                        </Link>
                    </div>
                    <div className="menuNav">
                        <Link to='/Chatbot'>
                            <i className='bx bx-message-rounded nav__icon'></i>
                            <span>Chatbot</span>
                        </Link>
                    </div>
                    <div className="menuNav">
                        <Link to='/Information'>
                            <i className='bx bxs-info-circle nav__icon'></i>
                            <span>Informações/dicas</span>
                        </Link>
                    </div>
                    <div className="menuNav">
                        <Link to='/Login'>
                            <i className='bx bxs-log-out nav__icon'></i>
                            <span>Logout</span>
                        </Link>
                    </div>
                    <label className="theme-switch" for="checkbox">
                        <a>
                            <input id="checkbox" type="checkbox"></input>
                            <span className="whitemode">Dark-mode</span>
                        </a>
                    </label>
            </Menu>
        </div>   
    )
}
