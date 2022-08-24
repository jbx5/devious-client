import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("sz")
   @ObfuscatedSignature(
      descriptor = "Lbq;"
   )
   @Export("decimator")
   static Decimator decimator;
   @ObfuscatedName("vx")
   @ObfuscatedGetter(
      intValue = -1961432799
   )
   @Export("foundItemIdCount")
   static int foundItemIdCount;
   @ObfuscatedName("s")
   @Export("args")
   Object[] args;
   @ObfuscatedName("h")
   @Export("isMouseInputEvent")
   boolean isMouseInputEvent;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("widget")
   Widget widget;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1908546929
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 2078605609
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 292390885
   )
   @Export("opIndex")
   int opIndex;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("dragTarget")
   Widget dragTarget;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 358587025
   )
   @Export("keyTyped")
   int keyTyped;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 474745929
   )
   @Export("keyPressed")
   int keyPressed;
   @ObfuscatedName("n")
   @Export("targetName")
   String targetName;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -327885641
   )
   int field1039;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 736580663
   )
   @Export("type")
   int type = 76;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;I)V",
      garbageValue = "1390308076"
   )
   @Export("setArgs")
   public void setArgs(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1431944361"
   )
   @Export("setType")
   public void setType(int var1) {
      this.type = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljy;",
      garbageValue = "331732172"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.field3046, ServerPacket.field3047, ServerPacket.field3048, ServerPacket.field3127, ServerPacket.field3071, ServerPacket.field3152, ServerPacket.field3057, ServerPacket.field3053, ServerPacket.field3063, ServerPacket.field3064, ServerPacket.field3056, ServerPacket.field3051, ServerPacket.field3058, ServerPacket.field3065, ServerPacket.field3060, ServerPacket.field3061, ServerPacket.field3062, ServerPacket.field3055, ServerPacket.field3101, ServerPacket.field3114, ServerPacket.field3103, ServerPacket.field3122, ServerPacket.field3068, ServerPacket.field3072, ServerPacket.field3070, ServerPacket.field3095, ServerPacket.field3092, ServerPacket.field3073, ServerPacket.field3067, ServerPacket.field3075, ServerPacket.field3076, ServerPacket.field3077, ServerPacket.field3099, ServerPacket.field3079, ServerPacket.field3080, ServerPacket.field3081, ServerPacket.field3082, ServerPacket.field3083, ServerPacket.field3084, ServerPacket.field3085, ServerPacket.field3086, ServerPacket.field3087, ServerPacket.field3088, ServerPacket.field3050, ServerPacket.field3090, ServerPacket.field3091, ServerPacket.field3128, ServerPacket.field3093, ServerPacket.field3094, ServerPacket.field3125, ServerPacket.field3096, ServerPacket.field3097, ServerPacket.field3105, ServerPacket.field3098, ServerPacket.field3100, ServerPacket.field3074, ServerPacket.field3066, ServerPacket.field3069, ServerPacket.field3104, ServerPacket.field3106, ServerPacket.field3052, ServerPacket.field3089, ServerPacket.field3108, ServerPacket.field3109, ServerPacket.field3110, ServerPacket.field3111, ServerPacket.field3112, ServerPacket.field3113, ServerPacket.field3151, ServerPacket.field3115, ServerPacket.field3116, ServerPacket.field3117, ServerPacket.field3118, ServerPacket.field3054, ServerPacket.field3120, ServerPacket.field3049, ServerPacket.field3102, ServerPacket.field3123, ServerPacket.field3138, ServerPacket.field3119, ServerPacket.field3126, ServerPacket.field3136, ServerPacket.field3132, ServerPacket.field3129, ServerPacket.field3130, ServerPacket.field3131, ServerPacket.field3124, ServerPacket.field3133, ServerPacket.field3134, ServerPacket.field3135, ServerPacket.field3059, ServerPacket.field3137, ServerPacket.field3107, ServerPacket.field3139, ServerPacket.field3140, ServerPacket.field3141, ServerPacket.field3142, ServerPacket.field3143, ServerPacket.field3144, ServerPacket.field3145, ServerPacket.field3146, ServerPacket.field3147, ServerPacket.field3148, ServerPacket.field3149, ServerPacket.field3150};
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "([BI)Lii;",
      garbageValue = "1858757744"
   )
   static WorldMapSprite method2063(byte[] var0) {
      return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class155.method3172(var0).pixels);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1186851078"
   )
   public static int method2064(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
