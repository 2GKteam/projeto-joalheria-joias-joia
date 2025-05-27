document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("cadastroProdutoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const nome = document.getElementById("nome").value;
        const pre = document.getElementById("pre").value;
        const desc = document.getElementById("desc").value;
        const imgUrl = document.getElementById("imgUrl").files[0];

        const formData = new FormData();
        formData.append("nome", nome);
        formData.append("pre", pre);
        formData.append("desc", desc);
        formData.append("imgUrl", imgUrl);

        try {
            const response = await fetch("http://localhost:8080/produto", {
                method: "POST",
                body: formData
            });

            if (response.ok) {
                alert("Produto Cadastrado com Sucesso!");
            } else {
                alert("Falha ao Cadastrar o Produto :(");
            }
        } catch (error) {
            console.error("Erro ao cadastrar o Produto:", error);
            alert("Erro inesperado ao cadastrar o produto.");
        }
    });
});
