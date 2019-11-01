'use strict';

const express = require('express');
const bodyParser = require('body-parser');
require('dotenv').config();

const app = express();
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
const PORT = process.env.PORT || 1337;

app.use(express.static('public'));

//Hompage stuff
app.get('/', (req, res, next) => {
	res.sendFile('index.html', { root: './' });
});

app.get('/fourhead', (req, res, next) => {
	res.sendFile('fourhead.html', { root: './' });
});

app.get('/pogu', (req, res, net) => {
	res.sendFile('pogu.html', { root: './' });
});

app.get('/weirdchamp', (req, res, next) => {
	res.sendFile('weirdchamp.html', { root: './' });
});

app.get('/login', (req, res, next) => {
	res.sendFile('indexlogin.html', { root: './' });
});

//Where the server is located and listening
app.listen(PORT, () => {
	console.log(`Server running on ${PORT}`);
});
