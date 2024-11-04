import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface ApiService {
    @GET("produk") // Endpoint untuk mendapatkan data produk
    Call<List<Produk>> getProduk();
}