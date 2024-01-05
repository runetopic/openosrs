import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	static class60 field359;
	@ObfuscatedName("ac")
	static int field377;
	@ObfuscatedName("al")
	static int field361;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lcf;"
	)
	static VorbisCodebook[] field362;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	static VorbisFloor[] field363;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lbs;"
	)
	static VorbisResidue[] field364;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	static VorbisMapping[] field365;
	@ObfuscatedName("as")
	static boolean[] field378;
	@ObfuscatedName("ay")
	static int[] field367;
	@ObfuscatedName("ak")
	static boolean field368;
	@ObfuscatedName("ae")
	static float[] field374;
	@ObfuscatedName("an")
	static float[] field375;
	@ObfuscatedName("ag")
	static float[] field355;
	@ObfuscatedName("ad")
	static float[] field376;
	@ObfuscatedName("af")
	static float[] field358;
	@ObfuscatedName("be")
	static float[] field366;
	@ObfuscatedName("bd")
	static int[] field380;
	@ObfuscatedName("bl")
	static int[] field381;
	@ObfuscatedName("at")
	byte[][] field357;
	@ObfuscatedName("ah")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("ar")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("ao")
	@Export("start")
	int start;
	@ObfuscatedName("ab")
	@Export("end")
	int end;
	@ObfuscatedName("au")
	boolean field379;
	@ObfuscatedName("aj")
	float[] field369;
	@ObfuscatedName("am")
	int field370;
	@ObfuscatedName("aq")
	int field371;
	@ObfuscatedName("ai")
	boolean field372;
	@ObfuscatedName("aw")
	float[] field373;
	@ObfuscatedName("bi")
	@Export("samples")
	byte[] samples;
	@ObfuscatedName("bv")
	int field383;
	@ObfuscatedName("bf")
	int field384;

	static {
		field359 = new class60();
		field368 = false;
	}

	VorbisSample(byte[] var1) {
		this.read(var1);
	}

	@ObfuscatedName("ah")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.sampleRate = var2.readInt();
		this.sampleCount = var2.readInt();
		this.start = var2.readInt();
		this.end = var2.readInt();
		if (this.end < 0) {
			this.end = ~this.end;
			this.field379 = true;
		}

		int var3 = var2.readInt();
		this.field357 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field357[var4] = var7;
		}

	}

	@ObfuscatedName("ao")
	float[] method1114(int var1) {
		class60 var2 = new class60();
		var2.method1189(this.field357[var1], 0);
		this.field373 = new float[field361];
		var2.method1188();
		int var3 = var2.method1187(LoginScreenAnimation.iLog(field367.length - 1));
		boolean var4 = field378[var3];
		int var5 = var4 ? field361 : field377;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method1188() != 0;
			var7 = var2.method1188() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field377 >> 2);
			var10 = (field377 >> 2) + (var5 >> 2);
			var11 = field377 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field377 >> 2);
			var13 = (field377 >> 2) + (var5 - (var5 >> 2));
			var14 = field377 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = field365[field367[var3]];
		int var16 = var15.field341;
		int var17 = var15.field343[var16];
		class59 var18 = field363[var17].method780(var2);
		boolean var19 = !var18.method1173();

		int var20;
		for (var20 = 0; var20 < var15.field340; ++var20) {
			VorbisResidue var45 = field364[var15.field342[var20]];
			float[] var47 = this.field373;
			var45.method895(var47, var5 >> 1, var19, var2);
		}

		if (var18.method1173()) {
			var16 = var15.field341;
			int var10000 = var15.field343[var16];
			var18.method1172(this.field373, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method1173()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field373[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field373;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? field376 : field374;
			float[] var25 = var4 ? field358 : field375;
			float[] var26 = var4 ? field366 : field355;
			int[] var27 = var4 ? field381 : field380;

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var21; ++var28) {
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
				var31 = var43[var28 * 2];
				var32 = var43[var28 * 2 + 1];
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var22; ++var28) {
				var29 = var23[var20 + var28 * 4 + 3];
				var30 = var23[var20 + var28 * 4 + 1];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + var28 * 4 + 3] = var29 + var31;
				var23[var20 + var28 * 4 + 1] = var30 + var32;
				var33 = var43[var20 - 4 - var28 * 4];
				var34 = var43[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
			}

			var28 = LoginScreenAnimation.iLog(var5 - 1);

			int var48;
			int var49;
			int var50;
			int var51;
			for (var48 = 0; var48 < var28 - 3; ++var48) {
				var49 = var5 >> var48 + 2;
				var50 = 8 << var48;

				for (var51 = 0; var51 < 2 << var48; ++var51) {
					int var52 = var5 - var49 * var51 * 2;
					int var53 = var5 - var49 * (var51 * 2 + 1);

					for (int var35 = 0; var35 < var5 >> var48 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var52 - 1 - var36];
						float var38 = var23[var52 - 3 - var36];
						float var39 = var23[var53 - 1 - var36];
						float var40 = var23[var53 - 3 - var36];
						var23[var52 - 1 - var36] = var37 + var39;
						var23[var52 - 3 - var36] = var38 + var40;
						float var41 = var43[var35 * var50];
						float var42 = var43[var35 * var50 + 1];
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var53 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (var48 = 1; var48 < var22 - 1; ++var48) {
				var49 = var27[var48];
				if (var48 < var49) {
					var50 = var48 * 8;
					var51 = var49 * 8;
					var33 = var23[var50 + 1];
					var23[var50 + 1] = var23[var51 + 1];
					var23[var51 + 1] = var33;
					var33 = var23[var50 + 3];
					var23[var50 + 3] = var23[var51 + 3];
					var23[var51 + 3] = var33;
					var33 = var23[var50 + 5];
					var23[var50 + 5] = var23[var51 + 5];
					var23[var51 + 5] = var33;
					var33 = var23[var50 + 7];
					var23[var50 + 7] = var23[var51 + 7];
					var23[var51 + 7] = var33;
				}
			}

			for (var48 = 0; var48 < var20; ++var48) {
				var23[var48] = var23[var48 * 2 + 1];
			}

			for (var48 = 0; var48 < var22; ++var48) {
				var23[var5 - 1 - var48 * 2] = var23[var48 * 4];
				var23[var5 - 2 - var48 * 2] = var23[var48 * 4 + 1];
				var23[var5 - var21 - 1 - var48 * 2] = var23[var48 * 4 + 2];
				var23[var5 - var21 - 2 - var48 * 2] = var23[var48 * 4 + 3];
			}

			for (var48 = 0; var48 < var22; ++var48) {
				var30 = var26[var48 * 2];
				var31 = var26[var48 * 2 + 1];
				var32 = var23[var20 + var48 * 2];
				var33 = var23[var20 + var48 * 2 + 1];
				var34 = var23[var5 - 2 - var48 * 2];
				float var54 = var23[var5 - 1 - var48 * 2];
				float var55 = var31 * (var32 - var34) + var30 * (var33 + var54);
				var23[var20 + var48 * 2] = (var32 + var34 + var55) * 0.5F;
				var23[var5 - 2 - var48 * 2] = (var32 + var34 - var55) * 0.5F;
				var55 = var31 * (var33 + var54) - var30 * (var32 - var34);
				var23[var20 + var48 * 2 + 1] = (var33 - var54 + var55) * 0.5F;
				var23[var5 - 1 - var48 * 2] = (-var33 + var54 + var55) * 0.5F;
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var20 + var48 * 2] * var25[var48 * 2] + var23[var20 + var48 * 2 + 1] * var25[var48 * 2 + 1];
				var23[var20 - 1 - var48] = var23[var20 + var48 * 2] * var25[var48 * 2 + 1] - var23[var20 + var48 * 2 + 1] * var25[var48 * 2];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + (var5 - var21)] = -var23[var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var21 + var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var21 + var48] = -var23[var21 - var48 - 1];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var20 + var48] = var23[var5 - var48 - 1];
			}

			float[] var57;
			for (var48 = var9; var48 < var10; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field373;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field373;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field370 > 0) {
			var21 = var5 + this.field370 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field372) {
				for (var22 = 0; var22 < this.field371; ++var22) {
					var46 = var22 + (this.field370 >> 1);
					var44[var22] += this.field369[var46];
				}
			}

			if (var18.method1173()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field373[var22];
				}
			}
		}

		float[] var56 = this.field369;
		this.field369 = this.field373;
		this.field373 = var56;
		this.field370 = var5;
		this.field371 = var13 - (var5 >> 1);
		this.field372 = !var18.method1173();
		return var44;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([I)Lbt;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.samples == null) {
				this.field370 = 0;
				this.field369 = new float[field361];
				this.samples = new byte[this.sampleCount];
				this.field383 = 0;
				this.field384 = 0;
			}

			for (; this.field384 < this.field357.length; ++this.field384) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method1114(this.field384);
				if (var2 != null) {
					int var3 = this.field383;
					int var4 = var2.length;
					if (var4 > this.sampleCount - var3) {
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.samples[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field383;
					}

					this.field383 = var3;
				}
			}

			this.field369 = null;
			byte[] var7 = this.samples;
			this.samples = null;
			return new RawSound(this.sampleRate, var7, this.start, this.end, this.field379);
		}
	}

	@ObfuscatedName("at")
	@Export("float32Unpack")
	static float float32Unpack(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfuscatedName("ar")
	static void method1133(byte[] var0) {
		class60 var1 = field359;
		var1.method1189(var0, 0);
		field377 = 1 << var1.method1187(4);
		field361 = 1 << var1.method1187(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field361 : field377;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var13 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var13[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var13[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var14 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var14[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var14[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var15 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var15[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var15[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var16 = new int[var6];
			int var11 = LoginScreenAnimation.iLog(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				var16[var12] = class361.method6868(var12, var11);
			}

			if (var2 != 0) {
				field376 = var13;
				field358 = var14;
				field366 = var15;
				field381 = var16;
			} else {
				field374 = var13;
				field375 = var14;
				field355 = var15;
				field380 = var16;
			}
		}

		var2 = var1.method1187(8) + 1;
		field362 = new VorbisCodebook[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field362[var3] = new VorbisCodebook();
		}

		var3 = var1.method1187(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method1187(16);
		}

		var3 = var1.method1187(6) + 1;
		field363 = new VorbisFloor[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field363[var4] = new VorbisFloor();
		}

		var4 = var1.method1187(6) + 1;
		field364 = new VorbisResidue[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field364[var5] = new VorbisResidue();
		}

		var5 = var1.method1187(6) + 1;
		field365 = new VorbisMapping[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field365[var6] = new VorbisMapping();
		}

		var6 = var1.method1187(6) + 1;
		field378 = new boolean[var6];
		field367 = new int[var6];

		for (int var7 = 0; var7 < var6; ++var7) {
			field378[var7] = var1.method1188() != 0;
			var1.method1187(16);
			var1.method1187(16);
			field367[var7] = var1.method1187(8);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lol;)Z"
	)
	static boolean method1116(AbstractArchive var0) {
		if (!field368) {
			byte[] var1 = var0.takeFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method1133(var1);
			field368 = true;
		}

		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lol;II)Lcv;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method1116(var0)) {
			var0.tryLoadFile(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.takeFile(var1, var2);
			return var3 == null ? null : new VorbisSample(var3);
		}
	}
}
