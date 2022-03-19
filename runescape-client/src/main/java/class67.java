import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class67 {
	@ObfuscatedName("c")
	static final BigInteger field856;
	@ObfuscatedName("b")
	static final BigInteger field857;

	static boolean RSPS = true;


	static {
		if (!RSPS) {
			field856 = new BigInteger("10001", 16); // L: 6
			field857 = new BigInteger("959194ea8a966b960e862427e497e246718ecc7e76f242845673d52b62df19f52fa6fb93c8d9c5129b95747f8ca61fb059fa44297c08c6f5cc6cca99e8d39fc8f0faa58e58d1ca99e861439d01158c14880260b09ace07d25862f6d14e2db785c3016567101e927e4b2513e0b8a0f275ccf60c6a689af387a64b2b82a313d8dd", 16); // L: 7
		} else {
			field856 = new BigInteger("65537");
			field857 = new BigInteger("101152132894052393265886644489429469067887733993499471826334750806131431774995232950094045980615261210482740859538462033841944288877997111341162261129657268035424385776764492943939466200272309679088830878857767599863397432612329236019641861788901097158810527108145428907942159175673330991981851896173021952237");
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1654088160"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		PlayerType.method5521(2);
		if (var0) {
			Login.Login_password = "";
		}

		HealthBar.method2311();
		WorldMapID.method4805();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-67"
	)
	static int method1962(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field814 - 7.0D) * 256.0D);
	}
}
