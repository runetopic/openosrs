import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class129 {
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1804512365
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 6548803859152250067L
	)
	long field1513;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2135269879
	)
	int field1511;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	IterableNodeDeque field1512;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class129(Buffer var1) {
		this.field1511 = -1;
		this.field1512 = new IterableNodeDeque();
		this.method2780(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-65"
	)
	void method2780(Buffer var1) {
		this.field1513 = var1.readLong();
		this.field1511 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class148(this);
			} else if (var2 == 1) {
				var3 = new class124(this);
			} else if (var2 == 13) {
				var3 = new class141(this);
			} else if (var2 == 4) {
				var3 = new class133(this);
			} else if (var2 == 6) {
				var3 = new class140(this);
			} else if (var2 == 5) {
				var3 = new class125(this);
			} else if (var2 == 2) {
				var3 = new class130(this);
			} else if (var2 == 7) {
				var3 = new class123(this);
			} else if (var2 == 14) {
				var3 = new class127(this);
			} else if (var2 == 8) {
				var3 = new class144(this);
			} else if (var2 == 9) {
				var3 = new class150(this);
			} else if (var2 == 10) {
				var3 = new class136(this);
			} else if (var2 == 11) {
				var3 = new class131(this);
			} else if (var2 == 12) {
				var3 = new class135(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class145(this);
			}

			((class126)var3).vmethod3029(var1);
			this.field1512.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "1939011884"
	)
	public void method2781(ClanSettings var1) {
		if (this.field1513 == var1.field1562 && this.field1511 == var1.field1563) {
			for (class126 var2 = (class126)this.field1512.last(); var2 != null; var2 = (class126)this.field1512.previous()) {
				var2.vmethod3028(var1);
			}

			++var1.field1563;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lix;",
		garbageValue = "828857412"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.VARP_LARGE, ServerPacket.field2931, ServerPacket.IF_OPEN_SUB, ServerPacket.field2933, ServerPacket.field2934, ServerPacket.field2930, ServerPacket.field2936, ServerPacket.field2937, ServerPacket.field3000, ServerPacket.MIDI_JINGLE, ServerPacket.field2940, ServerPacket.field2941, ServerPacket.field2942, ServerPacket.IF_CLOSE_SUB, ServerPacket.field2944, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field2946, ServerPacket.field3008, ServerPacket.field2948, ServerPacket.field2949, ServerPacket.SEND_LOGOUT_TYPE, ServerPacket.field2951, ServerPacket.field2961, ServerPacket.field2982, ServerPacket.field2954, ServerPacket.field2955, ServerPacket.field2956, ServerPacket.field2978, ServerPacket.field2958, ServerPacket.field2959, ServerPacket.IF_MOVE_SUB, ServerPacket.field2938, ServerPacket.UPDATE_PUBLIC_CHAT_MODE, ServerPacket.field2963, ServerPacket.UPDATE_SKILLS, ServerPacket.CAM_RESET, ServerPacket.MINI_MAP_TOGGLE, ServerPacket.field2986, ServerPacket.field2968, ServerPacket.field3005, ServerPacket.NPC_INFO_EXTENDED_VIEWPORT, ServerPacket.SET_PLAYER_OP, ServerPacket.field2972, ServerPacket.HINT_ARROW, ServerPacket.field2974, ServerPacket.field2975, ServerPacket.field2976, ServerPacket.field2987, ServerPacket.SEND_OPEN_URL, ServerPacket.field2979, ServerPacket.UPDATE_WEIGHT, ServerPacket.field2981, ServerPacket.field2957, ServerPacket.field2939, ServerPacket.field2984, ServerPacket.field2985, ServerPacket.field3016, ServerPacket.IF_SET_HIDDEN, ServerPacket.field2943, ServerPacket.UPDATE_RUN_ENERGY, ServerPacket.field2990, ServerPacket.field2991, ServerPacket.IF_SET_COLOR, ServerPacket.field2993, ServerPacket.field2994, ServerPacket.field2995, ServerPacket.field2996, ServerPacket.field2952, ServerPacket.field2998, ServerPacket.MESSAGE_GAME, ServerPacket.field2953, ServerPacket.RUN_CLIENTSCRIPT, ServerPacket.field3002, ServerPacket.field2960, ServerPacket.field3004, ServerPacket.field2966, ServerPacket.IF_SET_EVENT, ServerPacket.field3007, ServerPacket.NPC_INFO_NORMAL, ServerPacket.field3009, ServerPacket.field3010, ServerPacket.SOUND_EFFECT, ServerPacket.field3012, ServerPacket.field2969, ServerPacket.UPDATE_CONTAINER_PARTIAL, ServerPacket.UPDATE_PRIVATE_CHAT_STATUS, ServerPacket.field2935, ServerPacket.LOG_OUT, ServerPacket.UPDATE_CONTAINER_FULL, ServerPacket.field3019, ServerPacket.NPC_INFO_EXTENDED_VIEWPORT_NEW, ServerPacket.field3021, ServerPacket.field3022, ServerPacket.SET_MAP_FLAG, ServerPacket.VARP_SMALL, ServerPacket.SEND_DYNAMIC_MAP, ServerPacket.field3026, ServerPacket.CAM_SHAKE};
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "604899148"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		AbstractWorldMapData.scrollBarSprites[0].drawAt(var0, var1);
		AbstractWorldMapData.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field693);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field716);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field544);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field544);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field544);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field544);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field509);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field509);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field509);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field509);
	}
}
