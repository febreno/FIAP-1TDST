import React from 'react'
import TimeLine from '../../components/timeLine/TimeLine'
import CardUser from '../../components/cards/CardUser'

export default () =>{
    return(
        <div>
            <h1>Candidato/Recrutador</h1>
            <h2>Etapas Contratacao</h2>
            <TimeLine/>
            <h2>Perfis Cadastratros em vagas</h2>
            <CardUser/>
            <CardUser/>
        </div>
    )
}