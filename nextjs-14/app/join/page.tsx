"use client";
import axios from "axios";

import { useState } from "react";
import { useRouter } from "next/navigation";
const SERVER = "http://localhost:8080";

export default function Join() {
  const [userName, setuserName] = useState("");
  const [password, setpassword] = useState("");
  const [passwordConfirm, setpasswordConfirm] = useState("")
  const [name, setName] = useState("");
  const [phone, setPhone] = useState("");
  const [job, setjob] = useState("");
  const [height, setheight] = useState("");
  const [weight, setweight] = useState("");


  const handleUserName = (e: any) => {
    setuserName(e.target.value);
  };
  const handlePassword = (e: any) => {
    setpassword(e.target.value);
  };
  const handlePasswordConfirm = (e:any)=>{
    setpasswordConfirm(e.target.value)
  }
  const handleName = (e:any)=>{
    setName(e.target.value)
  }
  const handlePhone = (e:any)=>{
    setPhone(e.target.value)
  }
  const handleJop = (e:any)=>{
    setjob(e.target.value)
  }
  const handleHeight = (e:any)=>{
    setheight(e.target.value)
  }
  const handleWeight = (e:any)=>{
    setweight(e.target.value)
  }

  const router = useRouter();  

  const handleCancel = ()=>{  }

  const handleSignup = () => {
    alert(userName + "님 로그인 성공");

    const url = `${SERVER}/api/users`;
    const data = { userName, password, passwordConfirm, name, phone, job, height, weight };
    const config = {
      headers: {
        "Cache-Control": "no-cache",
        "Content-Type": "application/json",
        Authorization: `Bearer blah ~`,
        "Access-Control-Allow-Origin": "*",
      },
    };
    axios.post(url, data, config).then((res) => {
      alert("리스핀스가 가져온 이름 : " + JSON.stringify(res.data))
      router.push("/login")
    });
  };

  return (
    <>
      <div className="container">
        <h1>Sign Up</h1>
        <p>Please fill in this form to create an account.</p>
        <hr />
        <label htmlFor="username">
          <b>Username</b>
        </label>
        <input placeholder="Enter Email" name="email" required type="text" onChange = {handleUserName}/>
        <br />
        <br />
        <label htmlFor="psw">
          <b>Password</b>
        </label>
        <input
          placeholder="Enter Password"
          name="psw"
          required
          type="password" onChange = {handlePassword}
        />
        <br />
        <br />
        <label htmlFor="psw-repeat">
          <b>Repeat Password</b>
        </label>
        <input
          type="password"
          placeholder="Repeat Password"
          name="psw-repeat"
          required
          onChange = {handlePasswordConfirm}
        />
        <br />
        <br />
        <b>Name</b>
        <input type ="text" onChange = {handleName}/>
        <br />
        <br />
        <b>Phone</b>
        <input type ="text" onChange = {handlePhone}/>

        <br />
        <br />
        <b>Jop</b>
        <input type ="text" onChange = {handleJop}/>        <br />
        <br />
        <b>height</b>
        <input type ="text" onChange = {handleHeight}/>        <br />
        <br />
        <b>weight</b>
        <input type ="text" onChange = {handleWeight}/>
        <label>
          <input
            defaultChecked
            name="remember"
            style={{ marginBottom: "15px" }}
            type="checkbox"
            
          />{" "}
          Remember me
        </label>

        <p>
          By creating an account you agree to our{" "}
          <a href="#" style={{ color: "dodgerblue" }}>
            Terms & Privacy
          </a>
          .
        </p>

        <div className="clearfix">
          <button
            className="cancelbtn"
            onClick={handleCancel}
            type="button"
          >
            Cancel
          </button>
          <button className="signupbtn" type="submit" onClick={handleSignup}>
            Sign Up
          </button>
        </div>
      </div>
    </>
  );
}
