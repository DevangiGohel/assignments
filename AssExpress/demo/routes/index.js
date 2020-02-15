var express = require('express');
var router = express.Router();
var mysql =require('mysql');



var dbConn = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'root',
  database: 'employeedb'
});
//dbConn.connect(); 
dbConn.connect((err) => {
  if(err){
    console.log('Error connecting to Db');
    return;
  }
  console.log('Connection established');
});

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});
router.get('/users', function (req, res) {
  dbConn.query('SELECT * FROM employee', function (error, results, fields) {
      if (error) throw error;
      return res.send({ error: false, data: results, message: 'users list.' });
  });
});

router.get('/user/:id', function (req, res) {
  let user_id = req.params.id;
  if (!user_id) {
   return res.status(400).send({ error: true, message: 'Please provide user_id' });
  }
  dbConn.query('SELECT * FROM employee where id=?', user_id, function (error, results, fields) {
   if (error) throw error;
    return res.send({ error: false, data: results[0], message: 'users list.' });
  });
});
//insert
router.post('/insert', function (req, res) {
  let ID = req.body.ID;
  let Name = req.body.Name;
  let Age = req.body.Age;
  if (!ID || !Name || !Age) {
    return res.status(400).send({ error:true, message: 'Please provide user' });
  }
 dbConn.query("INSERT INTO employee(ID,Name,Age) VALUES (?,?,?)", [ID,Name,Age], function (error, results, fields) {
if (error) throw error;
  return res.send({ error: false, data: results, message: 'New employee is added successfully.....' });
  });
});


//update
router.put('/update', function (req, res) {
  let ID = req.body.ID;
  let Name = req.body.Name;
  let Age = req.body.Age;
  if (!ID || !Name || !Age) {
    return res.status(400).send({ error: user, message: 'Please provide user and user_id' });
  }
  dbConn.query("UPDATE employee SET Name = ? , Age = ? WHERE ID = ?",[ID,Name,Age], function (error, results, fields) {
    if (error) throw error;
    return res.send({ error: false, data: results, message: 'employee updated successfully.......' });
   });
});

//delete

router.delete('/delete', function (req, res) {
  let ID = req.body.ID;
  if (!ID) {
      return res.status(400).send({ error: true, message: 'Please provide user_id' });
  }
  dbConn.query('DELETE FROM employee WHERE ID = ?', [ID], function (error, results, fields) {
      if (error) throw error;
      return res.send({ error: false, data: results, message: 'employee deleted successfully......' });
  });
}); 
module.exports = router;
