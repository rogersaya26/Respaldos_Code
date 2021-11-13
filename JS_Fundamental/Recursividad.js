/* La recursividad consiste en funciones que se llaman a sí mismas,
evitando el uso de bucles y otros iteradores. */
//La recursividad tiene problemas en js por que no esta optimizada y da error
//RangeError: Maximum call stack size exceeded.
//para solucionar aprender usar *****Trampolines*****
/*
const conteoRegresivo = (a) => {
    if (a < 0) return
    console.log(a);
    return conteoRegresivo(a - 1);
}

conteoRegresivo(10);
*/

const axios = require('axios');

const llamarApi = async (url, llamados = 0) => {
    try {
        const result = await axios.get(url)
        console.log(result);
        return result
    }catch (e) {
        if (llamados > 5) {
            return ''
        }

        console.log(e);
        return llamarApi(url, llamados + 1);
    }
}
llamarApi('https://jsonplaceholder.typicode.com/users');