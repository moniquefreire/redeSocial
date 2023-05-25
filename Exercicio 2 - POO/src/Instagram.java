public class Instagram extends RedeSocial{
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() throws MetodoExecutado {
        if(foto.add(postarFoto))
            System.out.println("Postou foto no Instagram!");
        else{
            throw new MetodoExecutado("O método " + postarFoto + " já foi executado!");
        }
    }
    @Override
    public void postarVideo() throws MetodoExecutado {
        if(video.add(postarVideo))
            System.out.println("Postou vídeo no Instagram!");
        else{
            throw new MetodoExecutado("O método " + postarVideo + " já foi executado!");
        }
    }
    @Override
    public void postarComentario() throws MetodoExecutado {
        if(comentario.add(postarComentario))
            System.out.println("Postou comentário no Instagram!");
        else{
            throw new MetodoExecutado("O método " + postarComentario + " já foi executado!");
        }
    }
}
