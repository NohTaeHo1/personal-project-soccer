"use client";
import axios from "axios";

import { useState } from "react";
const SERVER = "http://localhost:8080";

export default function Login() {
  const [userName, setuserName] = useState("");
  const [password, setpassword] = useState("");

  const handleuserName = (e: any) => {
    setuserName(e.target.value);
  };
  const handlepassword = (e: any) => {
    setpassword(e.target.value);
  };
  const handleSubmit = () => {
    alert(userName + "님 로그인 성공");

    const url = `${SERVER}/login`;
    const data = { userName, password }; //key와 value가 같으면 생략 가능 원래는 userName:userName 식으로 적어야함. 하이픈 -  걸리면 생략부락
    const config = {
      headers: {
        "Cache-Control": "no-cache",
        "Content-Type": "application/json",
        Authorization: `Bearer blah ~`,
        "Access-Control-Allow-Origin": "*",
      },
    };

    axios.post(url, data, config).then((res) => {
      alert("리스핀스가 가져온 이름 : " + JSON.stringify(res.data));
    }); // res - 입력값
  };

  return (
    <>
      <div>로그인</div>
      <h3>아이디</h3>
      <input type="text" onChange={handleuserName} />
      <br />
      <h3>비밀번호</h3>
      <input type="text" onChange={handlepassword} />
      <br />
      <br />
      <button onClick={handleSubmit}>전송</button>
    </>
  );
}
//아이디, 비번, 전송버튼
