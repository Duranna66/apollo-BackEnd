import axios from "axios";

const instance = axios.create({
    baseURL: process.env.APOLLO_APP_BASE_URL,
});

export default instance;