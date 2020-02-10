import ReactDOM from 'react-dom';
import React from 'react';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Paper from '@material-ui/core/Paper';
import Grid from '@material-ui/core/Grid';

class login extends React.Component {
    
    state = {list:[]};
    onClick = (event) => {
        this.state.list.push(this.state);
        console.log(this.state.list);
        this.setState({name:'',contact:'',address:''});
        document.getElementById("form").reset();
    }
      myChangeHandler = (event) => {
        this.setState({name : event.target.value});
      }

      myChangeHandler1 = (event) => {
        this.setState({contact : event.target.value});
      }

      myChangeHandler2 = (event) => {
        this.setState({address : event.target.value});
      }
      
     
    render()
    {
        return(
            <React.Fragment>
            <center>
            <form id="form">
            <TextField name="name" label="Enter Name" onChange={this.myChangeHandler}/><br/><br/>
            <TextField id="address" label="Enter Address" onChange={this.myChangeHandler2}/><br/><br/>
            <TextField name="contact" label="Enter Contact" onChange={this.myChangeHandler1}/><br/><br/>
            <Button variant="contained" onClick={this.onClick}>CLICK</Button>
            </form>

            {this.state.list.map((emp,i) => (
                <Grid item xs={20}><br/>
                <Paper>Your name is : {emp.name}</Paper>
                <Paper> Address is : {emp.address}</Paper>
                <Paper> Contact no is :{emp.contact}</Paper>
                </Grid>
            ))}
            {/* {this.state.list.map((emp,i) => (
            <p>Your name is :{emp.name} <br/>Contact no is :{emp.contact}</p>
            ))} */}
           
            </center>
            </React.Fragment>
            )
    }
  
  };
export default login;