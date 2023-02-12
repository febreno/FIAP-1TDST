import React from 'react'
import Button from '../btns/BtnForm'
import './Inputs.css'

export default () => {
    return(
        <div className='form'>
            <input type="text" placeholder="Nickname" class="input"/>
            <input type="text" name="$user" placeholder="Phone number, username, or email"/>
            <Button/>
        </div>
    )
}