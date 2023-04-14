FROM node:19.9.0-bullseye

WORKDIR /usr/src/app

COPY . .

RUN npm install -g npm
RUN npm install

ENTRYPOINT [ "npm", "start" ]