import React from 'react'
import MelhoreSeuPerfil from '../../img/melhoreSeuPerfil.png'
import './InfoCards.css'

export default () => {
    return(
        <div class="about">
            <h3>Melhore seu Perfil</h3>
            <img src={MelhoreSeuPerfil} alt="melhore seu Perfil"/>
            <p>Um bom perfil pode chamar a atencao de diversos recrutadores, experimente escrever escrever de forma formal sobre seus dados profissionais e suas experiencias</p>
        </div>
    )
}