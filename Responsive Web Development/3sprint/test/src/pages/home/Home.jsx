import React from 'react'
import Job from '../../components/cards/CardJob' 
import './Home.css'

export default () =>{
    return(
        <div>
            <h1>Vagas</h1>
            <div class="search">
                <input type="text" name="iSerach" placeholder="Busque a melhor vaga para voce"/>
                <Job/>
                <Job/>
                <Job/>
            </div>
        </div>
    )
}