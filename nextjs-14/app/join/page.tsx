'use client'
import axios from 'axios'

import { useState } from "react"
const SERVER = "http://localhost:8080"

export default function Join() {

    const [userName, setuserName] = useState("")
    const [password, setpassword] = useState("")


    const handleUserName = (e:any)=>{
        setuserName(e.target.value)
    }
    const handlePassword = (e:any)=>{
        setpassword(e.target.value)
    }
    const handleClick = ()=>{
        alert(userName + '님 회원 가입 성공')

        const url = `${SERVER}/join`
        const data = {userName, password}
        const config = {
            headers: {
                "Cache-Control": "no-cache",
                "Content-Type": "application/json",
                Authorization: `Bearer blah ~`,
                "Access-Control-Allow-Origin": "*",
              }
        }
        axios.post(url, data, config).then((res)=>{
            alert('리스핀스가 가져온 이름 : '+JSON.stringify(res.data));
        })
    }

    return(<>
    <h2>아이디</h2>
    <input type="text" onChange = {handleUserName}/>
    <br />
    <h2>비밀번호</h2>
    <input type="text" onChange = {handlePassword}/>
    <br />
    <button onClick = {handleClick}> 회원가입 </button>

    </>)
}
