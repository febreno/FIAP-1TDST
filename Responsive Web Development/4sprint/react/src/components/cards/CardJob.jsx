import React, {useState} from 'react'
import styled from 'styled-components';
import PerfCompany from '../../img/company.png'
import './Card.css'


export default () =>{
    
    var [c,showAbotC]=useState(0)
    var AboutC = styled.div`display: none;
                            position: absolute;`
    if(c%2==0){
        console.log(c)
        AboutC = styled.div`display: none;
                            position: absolute;`
    }
    if(c%2!=0){
        AboutC = styled.div`z-index: -1;
                            position: unset;
                            margin-top: 20px;
                            display: inline-block;`
        console.log(c+AboutC)
    }

    return(
        <div class="card">
                {c==2? showAbotC(c=0) :''}
                <div class="infoC">
                    <div class="leftC">
                        <div class="imgC">
                            <img src={PerfCompany} alt=""/>
                        </div>
                        <div class="infoCard">
                            <h3>TI master</h3>
                            <h5>Java, React</h5>
                            <br />
                            <h5>Google</h5>
                            <h5>Sao paulo, BR</h5>
                            <AboutC>
                                <p> This is only a text about job, just for you know about company, all this is impportant pleaseread all,
                                    This is only a text about job, just for you know about company, all this is impportant pleaseread all
                                    This is only a text about job, just for you know about company, all this is impportant pleaseread all
                                </p>
                            </AboutC>
                        </div>
                    </div>
                    <div class="btnC">
                        <i class='bx bx-plus nav__icon'></i>
                    </div>
                </div>
            <div class="showMore" onClick={()=>showAbotC(c+1)}>
                <a><p>+ Sobre</p></a>
            </div>
        </div>
    )
}