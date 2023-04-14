import express from 'express';
import axios from 'axios';

const app = express();
const port = process.env.PORT;

app.get('/ping', (req, res) => {
  const data = { mensaje: 'Ping!' };
  res.json(data);
});

app.get('/forward', async (req, res) => {
  try {
    const url = req.query.url;
    const response = await axios.get(url);
    res.json(response.data);
  } catch (e) {
    res.status(500).send({ message: 'Internal server error' });
  }
});

app.listen(port, () => {
  console.log(`Listening on port ${port}`);
});