import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 407589317
   )
   @Export("type")
   int type;
   @ObfuscatedName("al")
   @Export("data")
   byte[] data;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpv;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive")
   Archive archive;

   ArchiveDiskAction() {
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-1494106242"
   )
   @Export("isCharAlphabetic")
   public static boolean isCharAlphabetic(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
