import React from 'react'
import './Card.css'
import PerfUser from '../../img/user.png'

export default () =>{
    return(
        <div class="card">
                <div class="infoC">
                    <div class="leftC">
                        <div class="imgC">
                            <img src={PerfUser} alt=""/>
                        </div>
                        <div class="infoCard">
                            <h3>Junior dion</h3>
                            <h5>Fullstack developer</h5>
                            <h5>Sao paulo, BR</h5>
                            <div class="aboutCOff">
                                <p>This is only a text about user, just for you know about company, all this is impportant pleaseread all,
                                    This is only a text about user, just for you know about company, all this is impportant pleaseread all
                                    This is only a text about user, just for you know about company, all this is impportant pleaseread all
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="btnC">
                        <i class='bx bx-bookmark nav__icon'></i>
                    </div>
                </div>
            <div class="showMore">
                <a><p>+ Sobre</p></a>
            </div>
        </div>
    )
}