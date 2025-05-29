document.getElementById("cep").addEventListener("input", async function () {
  const cep = this.value.replace(/\D/g, "");

  if (cep.length === 8) {
    try {
      const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);

      if (!response.ok) throw new Error("Erro ao buscar CEP");

      const dados = await response.json();

      if (dados.erro) {
        alert("CEP não encontrado.");
        return;
      }

      document.getElementById("rua").value = dados.logradouro;
      document.getElementById("bairro").value = dados.bairro;
      document.getElementById("cidade").value = dados.localidade;
      document.getElementById("estado").value = dados.uf;
    } catch (error) {
      alert("Erro ao buscar o endereço: " + error.message);
    }
  }
});


document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("cadastroEnderecoForm");

  // Busca o ID da pessoa armazenado
    const pessoaId = localStorage.getItem('pessoaId');

    if (!pessoaId) {
        alert("Pessoa não encontrada. Por favor, cadastre uma pessoa primeiro.");
        window.location.href = "cliente.html";
        return;
    }

  form.addEventListener("submit", async (event) => {
    event.preventDefault();

    const cep = document.getElementById("cep").value;
    const estado = document.getElementById("estado").value;
    const cidade = document.getElementById("cidade").value;
    const numero = document.getElementById("numero").value;
    const rua = document.getElementById("rua").value;
    const informacoes = document.getElementById("informacoes").value;
    const bairro = document.getElementById("bairro").value;

    try {
      const response = await fetch("http://localhost:8080/endereco", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({
          cep,
          estado,
          cidade,
          numero,
          rua,
          informacoes,
          bairro,
            usuario_id: {pessoaId}  

        }),
      });

      if (!response.ok) {
        alert("Erro ao cadastrar o Endereço");
      } else {
        alert("Endereço cadastrado com sucesso!");  // Aqui mostramos a mensagem de sucesso
      }
    } catch (error) {
      alert(error.message);
    }
  });
});
