package id.go.kepriprov.kiisgateway.services.bkpsdm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;

public class GetDataASN {
	public void GetData() {
		/*HiveDatabase hive = new HiveDatabase();
		JSONArray jsonbiodata = readJsonFromUrl(
				"http://silat.kepriprov.go.id/webservices/getBiodataPegawai?token=YWFua29taW5mbw==");
		System.out.println(jsonbiodata);

		for (int i = 0; i < jsonbiodata.length(); i++) {
			JSONObject obj = (JSONObject) jsonbiodata.get(i);
			String pegawai_id = obj.get("pegawai_id").toString();
			String skpd_id = obj.get("skpd_id").toString();
			String nip_baru = obj.get("nip_baru").toString();
			String nip_lama = obj.get("nip_lama").toString();
			String nuptk = obj.get("nuptk").toString();
			String status_kep_id = obj.get("status_kep_id").toString();
			String kppn_id = obj.get("kppn_id").toString();
			String nama = obj.get("nama").toString();
			nama = nama.replace("'", " ");

			String gelar_depan = obj.get("gelar_depan").toString();
			String gelar_belakang = obj.get("gelar_belakang").toString();
			String tempat_lahir = obj.get("tempat_lahir").toString();
			// String tgl_lahir = obj.get("tgl_lahir").toString();
			String nik = obj.get("nik").toString();
			String jk = obj.get("jk").toString();
			String agama_id = obj.get("agama_id").toString();
			String status_kawin_id = obj.get("status_kawin_id").toString();
			String alamat = obj.get("alamat").toString();
			String domisili_id = obj.get("domisili_id").toString();
			String alamat_domisili = obj.get("alamat_domisili").toString();
			String kode_pos = obj.get("kode_pos").toString();
			String kode_pos_domisili = obj.get("kode_pos_domisili").toString();
			String no_hp = obj.get("no_hp").toString();
			String email = obj.get("email").toString();
			String aktif = obj.get("aktif").toString();
			String tgl = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

			
			 * String sqlCommand = "INSERT INTO biodata SET pegawai_id=" + pegawai_id +
			 * ", skpd_id = '" + skpd_id + "', nip_baru = '" + nip_baru +"', nip_lama = '" +
			 * nip_lama + "', nuptk = '" + nuptk + "', status_kep_id = " + status_kep_id +
			 * ", kppn_id = " + kppn_id + ", nama = '" + nama + "', gelar_depan = '" +
			 * gelar_depan + "', gelar_belakang = '" + gelar_belakang +
			 * "', tempat_lahir = '" + tempat_lahir + "',nik = '" + nik + "', jk = '" + jk +
			 * "', agama_id = '" + agama_id + "', status_kawin_id = '" + status_kawin_id +
			 * "', alamat = '" + alamat + "', domisili_id = " + domisili_id +
			 * ", alamat_domisili = '" + alamat_domisili + "', kode_pos = '" + kode_pos +
			 * "', kode_pos_domisili = '" + kode_pos_domisili + "', no_hp = '" + no_hp +
			 * "', email = '" + email + "', aktif = '" + aktif + "'";
			 
			String sqlCommand = "INSERT INTO biodata VALUES(" + pegawai_id + ", '" + skpd_id + "', '" + nip_baru
					+ "', '" + nip_lama + "', '" + nuptk + "', " + status_kep_id + ", " + kppn_id + ", '" + nama
					+ "', '" + gelar_depan + "', '" + gelar_belakang + "', '" + tempat_lahir + "', '" + nik + "', '"
					+ jk + "', '" + agama_id + "', '" + status_kawin_id + "', '" + alamat + "', " + domisili_id + ", '"
					+ alamat_domisili + "', '" + kode_pos + "', '" + kode_pos_domisili + "', '" + no_hp + "', '" + email
					+ "', '" + aktif + "', '" + tgl + "')";
			System.out.println(sqlCommand);
			hive.insertRecord(sqlCommand);*/
		}
		


	public static JSONArray readJsonFromUrl(String url) throws IOException {
		// String s = URLEncoder.encode(url, "UTF-8");
		// URL url = new URL(s);
		InputStream is = new URL(url).openStream();
		JSONArray json = null;
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			json = new JSONArray(jsonText);
		} catch (JSONException e) {
			e.printStackTrace();
		} finally {
			is.close();
		}
		return json;
	}

	public static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}
}
