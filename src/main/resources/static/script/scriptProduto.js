document.addEventListener("DOMContentLoaded", () => {
    
    const form = document.getElementById("cadastroProdutoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

		const img = document.getElementById("imgUrl").value;
        const nome = document.getElementById("nome").value;
        const pre = document.getElementById("pre").value;
        const desc = document.getElementById("desc").value;
        const imgUrl = document.getElementById("imgUrl").files[0];

<<<<<<< HEAD
        async function cadastrarProduto() {
            try {
                const response = await fetch("http://localhost:8080/produto", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify({
                        nome,
                        pre,
                        desc,
                        imgUrl
                    }),
                });
        
                if (response.ok) {
                    alert("Produto Cadastrado com Sucesso!");
                } else {
                    alert("Falha ao Cadastrar o Produto :(");
                }
            } catch (error) {
                console.error("Erro ao cadastrar o Produto:", error);
=======
        try {
            const response = await fetch("http://localhost:8080/produto", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    img,
					nome,
                    pre,
                    desc,
                    imgUrl

                }),
            });

            if (response.ok) {
                alert("Produto Cadastrado com Sucesso!");
            } else {
                alert("Falha ao Cadastrar o Produto :(");
>>>>>>> f35442a901bd2fbed1f037f791f4ee917920e6da
            }
        }
    });
});