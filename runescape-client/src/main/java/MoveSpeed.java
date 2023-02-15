import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public enum MoveSpeed implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   field2363((byte)-1),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   field2366((byte)0),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   field2360((byte)1),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   field2362((byte)2);

   @ObfuscatedName("qp")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   @Export("HitSplatDefinition_cached")
   static class458 HitSplatDefinition_cached;
   @ObfuscatedName("z")
   @Export("speed")
   public byte speed;

   MoveSpeed(byte var3) {
      this.speed = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.speed;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "-30044"
   )
   public static int method4221(int var0, int var1) {
      return (-3 - var0 << 8) + var1;
   }
}
