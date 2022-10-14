import React from 'react'
import {Link} from 'react-router-dom'
import Logo from '../logo/index'
import './style.css'

export default () =>{
    return(
    <header>
        <div class="menu">
            <Logo/>
            <nav>
                <li><Link to='/'>Home</Link></li>
                <li><Link to='/menfashion'>Moda Masculina</Link></li>
                <li><Link to='/femininefashion'>Moda Feminina</Link></li>
                <li><Link to='/childrenfashion'>Moda Infantil</Link></li>
                <li><Link to='/about'>Sobre</Link></li>
            </nav>
        </div>
    </header>
    )
}