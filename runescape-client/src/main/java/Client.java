import org.json.JSONException;
import org.json.JSONObject;
import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class322 {
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = -1269216115
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = 1225799997
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wi")
	@ObfuscatedGetter(
		intValue = -1604975679
	)
	public static int field783;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	static final class229 field673;
	@ObfuscatedName("xl")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	static final ApproximateRouteStrategy field750;
	@ObfuscatedName("xn")
	static int[] field790;
	@ObfuscatedName("xf")
	static int[] field718;
	@ObfuscatedName("wl")
	@ObfuscatedGetter(
		intValue = 1907598029
	)
	static int field774;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = -1508952755
	)
	static int field720;
	@ObfuscatedName("xe")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("xd")
	@ObfuscatedGetter(
		intValue = 480920095
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("xi")
	@ObfuscatedGetter(
		intValue = 910334529
	)
	static int field645;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	static class487 field776;
	@ObfuscatedName("vt")
	static short field760;
	@ObfuscatedName("vd")
	static short field761;
	@ObfuscatedName("vp")
	static short field531;
	@ObfuscatedName("vb")
	static short field722;
	@ObfuscatedName("vk")
	static short field765;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -655369499
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vs")
	static short field764;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -1682958733
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = -1652855937
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vi")
	static boolean[] field755;
	@ObfuscatedName("vo")
	static int[] field756;
	@ObfuscatedName("va")
	static int[] field704;
	@ObfuscatedName("vy")
	static int[] field758;
	@ObfuscatedName("vw")
	static int[] field728;
	@ObfuscatedName("vc")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("wf")
	static List field500;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static class435 field779;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 2077097019
	)
	static int field636;
	@ObfuscatedName("br")
	static boolean field729;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1578693191
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -863214713
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1196057225
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("ce")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("ci")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1519857313
	)
	static int field488;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 243947283
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1862855915
	)
	static int field490;
	@ObfuscatedName("cn")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -2139283279
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1549345675
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dk")
	static boolean field494;
	@ObfuscatedName("ec")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 962758423
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		longValue = -8142216681054424443L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = 2093024465
	)
	static int field501;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 22566591
	)
	static int field502;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = 9058783913221914729L
	)
	static long field503;
	@ObfuscatedName("ef")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1125128507
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -289097033
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -2096187297
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 2023720801
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1822706211
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1244039727
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -419045454
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -2021083795
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -552169536
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ed")
	@Export("z")
	static boolean z;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static class92 field517;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -588032653
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -1477360267
	)
	static int field791;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1100594471
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1129030311
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -761293713
	)
	static int field522;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1521786269
	)
	static int field614;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1849205089
	)
	static int field675;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	static class531 field526;
	@ObfuscatedName("hc")
	static final String field537;
	@ObfuscatedName("ha")
	static final String field538;
	@ObfuscatedName("hn")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ib")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -906746739
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("iu")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -984446247
	)
	static int field637;
	@ObfuscatedName("il")
	static int[] field549;
	@ObfuscatedName("it")
	static String field767;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 355075581
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ii")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("jf")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1992662775
	)
	static int field555;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 2146509421
	)
	static int field678;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 2062057009
	)
	static int field521;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 1974863003
	)
	static int field558;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 666285399
	)
	static int field559;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "[Liw;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ja")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jt")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("kj")
	static final int[] field563;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -1774127427
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1776115789
	)
	static int field565;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -570178499
	)
	static int field670;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 540973989
	)
	static int field567;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -785299787
	)
	static int field568;
	@ObfuscatedName("ka")
	static boolean field569;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -650496269
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 1248624645
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -455128087
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1352056963
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 299500625
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -915258713
	)
	static int field548;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -1998128165
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -1814827049
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -469827945
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -2117744859
	)
	static int field579;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1967585531
	)
	static int field529;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -747448447
	)
	static int field763;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -203139789
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1910388411
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1574301625
	)
	public static int field584;
	@ObfuscatedName("ly")
	static boolean field585;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -1479145315
	)
	static int field523;
	@ObfuscatedName("lu")
	static boolean field587;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -909114115
	)
	static int field759;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -447515851
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1790424759
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("mb")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("md")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("my")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("mk")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mi")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mn")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mx")
	static int[][] field597;
	@ObfuscatedName("mv")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mm")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mq")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -212258435
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 2138989585
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -190656905
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1690442785
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 1378067361
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -1228948020
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 263783731
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ml")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 1977190337
	)
	static int field736;
	@ObfuscatedName("mg")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "[Lds;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 724172563
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1501940983
	)
	static int field754;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		longValue = -2389555093516551195L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("nb")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -1022035151
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -539073287
	)
	static int field617;
	@ObfuscatedName("na")
	static int[] field618;
	@ObfuscatedName("nh")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ny")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nu")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nx")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -1508153399
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "[[[Lon;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nv")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nt")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("ne")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nz")
	static int[] field540;
	@ObfuscatedName("nl")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nr")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1368885637
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ol")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("oz")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ov")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("oq")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oo")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("oa")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ou")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("om")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("og")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ob")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("os")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 481752741
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1626319321
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 757921443
	)
	static int field648;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -1812084391
	)
	static int field768;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1413140383
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("pm")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 1265673147
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -565449129
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("pp")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("pb")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 1658925683
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1742450303
	)
	static int field659;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 982091517
	)
	static int field660;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1324071041
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 213622459
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 1814135357
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -896347093
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1369038927
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pi")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -1053586819
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 568507323
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qu")
	static boolean field674;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1350248817
	)
	static int field554;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 950659321
	)
	static int field676;
	@ObfuscatedName("qy")
	static boolean field516;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 653531587
	)
	static int field533;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 483934473
	)
	static int field679;
	@ObfuscatedName("qn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -796191257
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qm")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -1725531237
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qc")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -532017517
	)
	static int field685;
	@ObfuscatedName("qs")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -2093121121
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qh")
	static int[] field688;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1767752687
	)
	static int field689;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -343622715
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 366761651
	)
	static int field747;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 1639645287
	)
	static int field692;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 654262707
	)
	static int field693;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -389268847
	)
	static int field588;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -1924930575
	)
	static int field551;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 892305799
	)
	static int field782;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -159332949
	)
	static int field697;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	static class466 field677;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -488483027
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static class544 field573;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static NodeDeque field682;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1270662475
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -193277661
	)
	static int field557;
	@ObfuscatedName("ri")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("ru")
	static boolean[] field785;
	@ObfuscatedName("rx")
	static boolean[] field515;
	@ObfuscatedName("rt")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("sg")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("sj")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("sr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = 1676430659
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		longValue = -5976517433399259521L
	)
	static long field716;
	@ObfuscatedName("sd")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sn")
	static int[] field483;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 1686012707
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1585421373
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sh")
	static String field694;
	@ObfuscatedName("sb")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -738645525
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static class223 field724;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static class221 field725;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 1219207087
	)
	static int field726;
	@ObfuscatedName("so")
	static int[] field586;
	@ObfuscatedName("sl")
	static int[] field518;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		longValue = -2398500741580166883L
	)
	static long field638;
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "[Lfc;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 1069400751
	)
	static int field601;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 819467357
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tt")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tg")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = 1769781979
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -313105013
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -1359162591
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tj")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -128069645
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ug")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ui")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("uv")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("uo")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "[Lbo;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uq")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ur")
	static boolean field748;
	@ObfuscatedName("ux")
	static boolean field749;
	@ObfuscatedName("uw")
	static boolean field661;
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class491 field751;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	static class490 field752;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	static class490 field672;
	@ObfuscatedName("un")
	static boolean field482;
	@ObfuscatedName("hb")
	@Export("token")
	String token;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	class14 field528;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	class18 field657;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("hq")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("hf")
	boolean field532;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1106066733
	)
	int field545;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	class18 field611;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	@Export("refreshAccessTokenRequester")
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("hk")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field702;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	class7 field542;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		longValue = -3042549022967002225L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field729 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field488 = -1;
		clientType = -1;
		field490 = -1;
		onMobile = false;
		revision = 218;
		gameState = 0;
		field494 = false;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field501 = -1;
		field502 = -1;
		field503 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		z = false;
		field517 = class92.field1136;
		js5ConnectState = 0;
		field791 = 0;
		js5Errors = 0;
		loginState = 0;
		field522 = 0;
		field614 = 0;
		field675 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field526 = class531.field5197;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		int var3;
		char var4;
		for (var3 = 0; var3 < var1; ++var3) {
			var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field537 = class415.base64Encode(var2);
		var1 = "com_jagex_auth_desktop_runelite:public".length();
		var2 = new byte[var1];

		for (var3 = 0; var3 < var1; ++var3) {
			var4 = "com_jagex_auth_desktop_runelite:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field538 = class415.base64Encode(var2);
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field637 = 0;
		field549 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field555 = 0;
		field678 = 1;
		field521 = 0;
		field558 = 1;
		field559 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field563 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		graphicsCycle = 0;
		field565 = 2301979;
		field670 = 5063219;
		field567 = 3353893;
		field568 = 7759444;
		field569 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		field548 = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field579 = 0;
		field529 = 0;
		field763 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field584 = 0;
		field585 = false;
		field523 = 0;
		field587 = false;
		field759 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field597 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field736 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field754 = 0;
		userId = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field617 = 0;
		field618 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field540 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field648 = 0;
		field768 = 50;
		isItemSelected = 0;
		field767 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field659 = 0;
		field660 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field674 = false;
		field554 = -1;
		field676 = -1;
		field516 = false;
		field533 = -1;
		field679 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field685 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field688 = new int[32];
		field689 = 0;
		chatCycle = 0;
		field747 = 0;
		field692 = 0;
		field693 = 0;
		field588 = 0;
		field551 = 0;
		field782 = 0;
		field697 = 0;
		mouseWheelRotation = 0;
		field573 = new class544();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field682 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field557 = -2;
		validRootWidgets = new boolean[100];
		field785 = new boolean[100];
		field515 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field716 = 0L;
		isResizable = true;
		field483 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field694 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field724 = new class223();
		field725 = new class221();
		field726 = 0;
		field586 = new int[128];
		field518 = new int[128];
		field638 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field601 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field748 = false;
		field749 = false;
		field661 = false;
		field751 = null;
		field752 = null;
		field672 = null;
		field482 = false;
		field755 = new boolean[5];
		field756 = new int[5];
		field704 = new int[5];
		field758 = new int[5];
		field728 = new int[5];
		field760 = 256;
		field761 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field764 = 1;
		field765 = 32767;
		field531 = 1;
		field722 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field774 = -1;
		field720 = -1;
		field776 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field779 = new class435(8, class433.field4645);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field636 = -1;
		field783 = -1;
		field500 = new ArrayList();
		field673 = new class229();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field645 = 0;
		field750 = new ApproximateRouteStrategy();
		field790 = new int[50];
		field718 = new int[50];
	}

	public Client() {
		this.field532 = false;
		this.field545 = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field716 = SpotAnimationDefinition.method3775() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1290(true);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-550390769"
	)
	@Export("setUp")
	protected final void setUp() {
		class4.method20(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		WorldMapCacheName.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		AbstractSocket.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class252.currentPort = WorldMapCacheName.worldPort;
		WorldMapLabelSize.field2440 = class342.field3642;
		class90.field1094 = class342.field3641;
		class503.field5015 = class342.field3643;
		PlayerComposition.field3606 = class342.field3640;
		class60.urlRequester = new class113(this.field532, 218);
		this.setUpKeyboard();
		this.method506();
		class396.mouseWheel = this.mouseWheel();
		this.method505(field725, 0);
		this.method505(field724, 1);
		this.setUpClipboard();
		class302.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = class131.getPreferencesFile("", Messages.field1401.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		WorldMapIcon_1.clientPreferences = var3;
		class27.method445(this, class14.field67);
		class9.setWindowedMode(WorldMapIcon_1.clientPreferences.getWindowMode());
		class12.friendSystem = new FriendSystem(class89.loginType);
		this.field528 = new class14("tokenRequest", 1, 1);
		if (!class316.field3420.contains(this)) {
			class316.field3420.add(this);
		}

		field673.method4440();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "564244601"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				boolean var5 = class516.method9145();
				if (var5 && playingJingle && MusicPatchPcmStream.pcmPlayer1 != null) {
					MusicPatchPcmStream.pcmPlayer1.tryDiscard();
				}

				class102.method2728();
				field724.method4313();
				this.method567();
				synchronized(MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (class396.mouseWheel != null) {
					int var6 = class396.mouseWheel.useRotation();
					mouseWheelRotation = var6;
				}

				if (gameState == 0) {
					WorldMapCacheName.method5005();
					WorldMapRenderer.method4746();
				} else if (gameState == 5) {
					Actor.loginScreen(this, class369.fontPlain11, ItemLayer.fontPlain12);
					WorldMapCacheName.method5005();
					WorldMapRenderer.method4746();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						Actor.loginScreen(this, class369.fontPlain11, ItemLayer.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						Actor.loginScreen(this, class369.fontPlain11, ItemLayer.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						ModeWhere.method7205();
					}
				} else {
					Actor.loginScreen(this, class369.fontPlain11, ItemLayer.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-851092167"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field716 != 0L && SpotAnimationDefinition.method3775() > field716) {
			class9.setWindowedMode(ApproximateRouteStrategy.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.fontPlain11, ItemLayer.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.fontPlain11, ItemLayer.fontPlain12);
			} else if (gameState == 50) {
				UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.fontPlain11, ItemLayer.fontPlain12);
			} else if (gameState == 25) {
				if (field559 == 1) {
					if (field555 > field678) {
						field678 = field555;
					}

					var2 = (field678 * 50 - field555 * 50) / field678;
					LoginPacket.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field559 == 2) {
					if (field521 > field558) {
						field558 = field521;
					}

					var2 = (field558 * 50 - field521 * 50) / field558 + 50;
					LoginPacket.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					LoginPacket.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				LoginPacket.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				LoginPacket.drawLoadingMessage("Please wait...", false);
			}
		} else {
			UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.fontPlain11, ItemLayer.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field785[var2]) {
					class338.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field785[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class338.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field785[var2] = false;
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1863199463"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class176.varcs.hasUnwrittenChanges()) {
			class176.varcs.write();
		}

		if (Message.mouseRecorder != null) {
			Message.mouseRecorder.isRunning = false;
		}

		Message.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		class396.mouseWheel = null;
		if (MusicPatchPcmStream.pcmPlayer1 != null) {
			MusicPatchPcmStream.pcmPlayer1.shutdown();
		}

		WorldMapSectionType.field2556.method7049();
		class227.method4406();
		if (class60.urlRequester != null) {
			class60.urlRequester.close();
			class60.urlRequester = null;
		}

		HealthBarDefinition.method3654();
		this.field528.method179();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-94"
	)
	protected final void vmethod1353() {
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2071645038"
	)
	boolean method1263() {
		return this.field545 == 1;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-22117"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return Messages.accessToken != null && !Messages.accessToken.trim().isEmpty() && ObjectComposition.refreshToken != null && !ObjectComposition.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class369.sessionId != null && !class369.sessionId.trim().isEmpty() && InterfaceParent.characterId != null && !InterfaceParent.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1304458364"
	)
	boolean method1347() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-191398087"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String refreshToken) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", refreshToken);
		URL var3 = new URL(class314.authServiceBaseUrl + "shield/oauth/token" + (new class475(var2)).method8589());
		HttpRequestBuilder var4 = new HttpRequestBuilder();
		if (this.method1263()) {
			var4.basicAuthentication(field538);
		} else {
			var4.basicAuthentication(field537);
		}

		var4.header("Host", (new URL(class314.authServiceBaseUrl)).getHost());
		var4.accept(HttpContentType.APPLICATION_JSON);
		class9 var5 = class9.field33;
		RefreshAccessTokenRequester var6 = this.refreshAccessTokenRequester;
		if (var6 != null) {
			this.refreshAccessTokenRequestFuture = var6.request(var5.method75(), var3, var4.getHeaders(), "");
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field532);
			this.field611 = this.field528.method181(var7);
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-43"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class314.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HttpRequestBuilder var3 = new HttpRequestBuilder();
		var3.bearerToken(var1);
		class9 var4 = class9.field31;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.otlTokenRequestFuture = var5.request(var4.method75(), var2, var3.getHeaders(), "");
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field532);
			this.field657 = this.field528.method181(var6);
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "169401816"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(FriendsChat.field4677 + "game-session/v1/tokens");
		class10 var4 = new class10(var3, class9.field33, this.field532);
		var4.method95().bearerToken(var1);
		var4.method95().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.method8392("accountId", var2);
		var4.method92(new HttpJsonContent(var5));
		this.field657 = this.field528.method181(var4);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "121204254"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = WorldMapSectionType.field2556.method7044();
			if (!var1) {
				this.method1276();
			}

		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1703369019"
	)
	void method1276() {
		if (WorldMapSectionType.field2556.field4343 >= 4) {
			this.error("js5crc");
			WorldMapSection2.updateGameState(1000);
		} else {
			if (WorldMapSectionType.field2556.field4327 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					WorldMapSection2.updateGameState(1000);
					return;
				}

				field791 = 3000;
				WorldMapSectionType.field2556.field4327 = 3;
			}

			if (--field791 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class101.js5SocketTask = GameEngine.taskHandler.newSocketTask(Friend.worldHost, class252.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class101.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class101.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class167.js5Socket = WorldMapData_0.method4467((Socket)class101.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(218);
						class167.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class310.field3388 = SpotAnimationDefinition.method3775();
					}

					if (js5ConnectState == 3) {
						if (class167.js5Socket.available() > 0) {
							int var2 = class167.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (SpotAnimationDefinition.method3775() - class310.field3388 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						WorldMapSectionType.field2556.method7046(class167.js5Socket, gameState > 20);
						class101.js5SocketTask = null;
						class167.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-267215757"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class101.js5SocketTask = null;
		class167.js5Socket = null;
		js5ConnectState = 0;
		if (class252.currentPort == WorldMapCacheName.worldPort) {
			class252.currentPort = AbstractSocket.js5Port;
		} else {
			class252.currentPort = WorldMapCacheName.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				WorldMapSection2.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					WorldMapSection2.updateGameState(1000);
				} else {
					field791 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			WorldMapSection2.updateGameState(1000);
		} else {
			field791 = 3000;
		}

	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1040776320"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (EnumComposition.field1896 == null && (secureRandomFuture.isDone() || field522 > 250)) {
					EnumComposition.field1896 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (EnumComposition.field1896 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					Player.field1125 = null;
					hadNetworkError = false;
					field522 = 0;
					if (field526.method9577()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(ObjectComposition.refreshToken);
								class19.updateLoginState(21);
							} catch (Throwable var22) {
								GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var22);
								class149.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class149.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class369.sessionId, InterfaceParent.characterId);
								class19.updateLoginState(20);
							} catch (Exception var21) {
								GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var21);
								class149.getLoginError(65);
								return;
							}
						}
					} else {
						class19.updateLoginState(1);
					}
				}
			}

			class20 var24;
			if (loginState == 21) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class149.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class149.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						Messages.accessToken = var3.getAccessToken();
						ObjectComposition.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var20);
						class149.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.field611 == null) {
						class149.getLoginError(65);
						return;
					}

					if (!this.field611.method283()) {
						return;
					}

					if (this.field611.method267()) {
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace(this.field611.method264(), (Throwable)null);
						class149.getLoginError(65);
						this.field611 = null;
						return;
					}

					var24 = this.field611.method269();
					if (var24.method297() != 200) {
						class149.getLoginError(65);
						this.field611 = null;
						return;
					}

					field522 = 0;
					HttpJsonContent var4 = new HttpJsonContent(var24.method299());

					try {
						Messages.accessToken = var4.getProperties().getString("access_token");
						ObjectComposition.refreshToken = var4.getProperties().getString("refresh_token");
					} catch (Exception var19) {
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Error parsing tokens", var19);
						class149.getLoginError(65);
						this.field611 = null;
						return;
					}
				}

				this.requestOtlToken(Messages.accessToken);
				class19.updateLoginState(20);
			}

			if (loginState == 20) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class149.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							class149.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var18);
						class149.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.field657 == null) {
						class149.getLoginError(65);
						return;
					}

					if (!this.field657.method283()) {
						return;
					}

					if (this.field657.method267()) {
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace(this.field657.method264(), (Throwable)null);
						class149.getLoginError(65);
						this.field657 = null;
						return;
					}

					var24 = this.field657.method269();
					if (var24.method297() != 200) {
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Response code: " + var24.method297() + "Response body: " + var24.method299(), (Throwable)null);
						class149.getLoginError(65);
						this.field657 = null;
						return;
					}

					List var27 = (List)var24.method301().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.method299());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var17);
							class149.getLoginError(65);
							this.field657 = null;
							return;
						}
					} else {
						this.token = var24.method299();
					}

					this.field657 = null;
				}

				field522 = 0;
				class19.updateLoginState(1);
			}

			if (loginState == 1) {
				if (Player.field1125 == null) {
					Player.field1125 = GameEngine.taskHandler.newSocketTask(Friend.worldHost, class252.currentPort);
				}

				if (Player.field1125.status == 2) {
					throw new IOException();
				}

				if (Player.field1125.status == 1) {
					var1 = WorldMapData_0.method4467((Socket)Player.field1125.result, 40000, 5000);
					packetWriter.setSocket(var1);
					Player.field1125 = null;
					class19.updateLoginState(2);
				}
			}

			PacketBufferNode var26;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var26 = HorizontalAlignment.method3686();
				var26.packetBuffer.writeByte(LoginPacket.field3377.id);
				packetWriter.addNode(var26);
				packetWriter.flush();
				var2.offset = 0;
				class19.updateLoginState(3);
			}

			int var12;
			if (loginState == 3) {
				if (MusicPatchPcmStream.pcmPlayer1 != null) {
					MusicPatchPcmStream.pcmPlayer1.method795();
				}

				if (var1.isAvailable(1)) {
					var12 = var1.readUnsignedByte();
					if (MusicPatchPcmStream.pcmPlayer1 != null) {
						MusicPatchPcmStream.pcmPlayer1.method795();
					}

					if (var12 != 0) {
						class149.getLoginError(var12);
						return;
					}

					var2.offset = 0;
					class19.updateLoginState(4);
				}
			}

			if (loginState == 4) {
				if (var2.offset < 8) {
					var12 = var1.available();
					if (var12 > 8 - var2.offset) {
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) {
						var1.read(var2.array, var2.offset, var12);
						var2.offset += var12;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					Clock.field2337 = var2.readLong();
					class19.updateLoginState(5);
				}
			}

			int var6;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var28 = new PacketBuffer(500);
				int[] var29 = new int[]{EnumComposition.field1896.nextInt(), EnumComposition.field1896.nextInt(), EnumComposition.field1896.nextInt(), EnumComposition.field1896.nextInt()};
				var28.offset = 0;
				var28.writeByte(1);
				var28.writeInt(var29[0]);
				var28.writeInt(var29[1]);
				var28.writeInt(var29[2]);
				var28.writeInt(var29[3]);
				var28.writeLong(Clock.field2337);
				if (gameState == 40) {
					var28.writeInt(class215.field2305[0]);
					var28.writeInt(class215.field2305[1]);
					var28.writeInt(class215.field2305[2]);
					var28.writeInt(class215.field2305[3]);
				} else {
					if (gameState == 50) {
						var28.writeByte(AuthenticationScheme.field1472.rsOrdinal());
						var28.writeInt(class160.field1748);
					} else {
						var28.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 1:
							var28.writeMedium(class53.otpMedium);
							++var28.offset;
							break;
						case 2:
							var28.offset += 4;
							break;
						case 3:
							var28.writeInt(WorldMapIcon_1.clientPreferences.getParameterValue(Login.Login_username));
						}
					}

					if (field526.method9577()) {
						var28.writeByte(class531.field5192.rsOrdinal());
						var28.writeStringCp1252NullTerminated(this.token);
					} else {
						var28.writeByte(class531.field5197.rsOrdinal());
						var28.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var28.encryptRsa(class74.field889, class74.field890);
				class215.field2305 = var29;
				PacketBufferNode var32 = HorizontalAlignment.method3686();
				var32.packetBuffer.offset = 0;
				if (gameState == 40) {
					var32.packetBuffer.writeByte(LoginPacket.field3380.id);
				} else {
					var32.packetBuffer.writeByte(LoginPacket.field3383.id);
				}

				var32.packetBuffer.writeShort(0);
				var6 = var32.packetBuffer.offset;
				var32.packetBuffer.writeInt(218);
				var32.packetBuffer.writeInt(1);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeByte(field490);
				byte var7 = 0;
				var32.packetBuffer.writeByte(var7);
				var32.packetBuffer.writeBytes(var28.array, 0, var28.offset);
				int var8 = var32.packetBuffer.offset;
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var32.packetBuffer.writeShort(Language.canvasWidth);
				var32.packetBuffer.writeShort(class47.canvasHeight);
				class354.method6858(var32.packetBuffer);
				var32.packetBuffer.writeStringCp1252NullTerminated(MenuAction.field878);
				var32.packetBuffer.writeInt(DevicePcmPlayerProvider.field111);
				if (revision > 213) {
					var32.packetBuffer.writeByte(0);
				}

				Buffer var9 = new Buffer(class60.platformInfo.size());
				class60.platformInfo.write(var9);
				var32.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeInt(0);
				var32.packetBuffer.writeIntLE(PcmPlayer.field281.hash);
				var32.packetBuffer.writeIntIME(SoundSystem.field298.hash);
				var32.packetBuffer.writeIntME(class145.field1643.hash);
				var32.packetBuffer.writeIntIME(class7.field25.hash);
				var32.packetBuffer.writeIntME(class514.archive6.hash);
				var32.packetBuffer.writeIntME(StructComposition.field2041.hash);
				var32.packetBuffer.writeIntIME(class313.archive4.hash);
				var32.packetBuffer.writeIntLE(UserComparator7.field1441.hash);
				var32.packetBuffer.writeIntME(WorldMapDecorationType.archive10.hash);
				var32.packetBuffer.writeIntLE(SpotAnimationDefinition.field2007.hash);
				var32.packetBuffer.writeIntIME(Canvas.field114.hash);
				var32.packetBuffer.writeIntLE(VarbitComposition.archive13.hash);
				var32.packetBuffer.writeInt(WorldMapData_0.field2426.hash);
				var32.packetBuffer.writeIntIME(0);
				var32.packetBuffer.writeIntME(class47.archive12.hash);
				var32.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.archive8.hash);
				var32.packetBuffer.writeIntME(Language.field4412.hash);
				var32.packetBuffer.writeInt(WorldMapSection0.archive9.hash);
				var32.packetBuffer.writeIntME(class19.field92.hash);
				var32.packetBuffer.writeIntLE(class344.archive2.hash);
				var32.packetBuffer.writeIntLE(BuddyRankComparator.field1460.hash);
				var32.packetBuffer.xteaEncrypt(var29, var8, var32.packetBuffer.offset);
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6);
				packetWriter.addNode(var32);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var29);
				int[] var10 = new int[4];

				for (int var11 = 0; var11 < 4; ++var11) {
					var10[var11] = var29[var11] + 50;
				}

				var2.newIsaacCipher(var10);
				class19.updateLoginState(6);
			}

			int var13;
			if (loginState == 6 && var1.available() > 0) {
				var12 = var1.readUnsignedByte();
				if (var12 == 61) {
					var13 = var1.available();
					PendingSpawn.field1169 = var13 == 1 && var1.readUnsignedByte() == 1;
					class19.updateLoginState(5);
				}

				if (var12 == 21 && gameState == 20) {
					class19.updateLoginState(12);
				} else if (var12 == 2) {
					class19.updateLoginState(14);
				} else if (var12 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class19.updateLoginState(19);
				} else if (var12 == 64) {
					class19.updateLoginState(10);
				} else if (var12 == 23 && field614 < 1) {
					++field614;
					class19.updateLoginState(0);
				} else if (var12 == 29) {
					class19.updateLoginState(17);
				} else {
					if (var12 != 69) {
						class149.getLoginError(var12);
						return;
					}

					class19.updateLoginState(7);
				}
			}

			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				Language.field4410 = var2.readUnsignedShort();
				class19.updateLoginState(8);
			}

			if (loginState == 8 && var1.available() >= Language.field4410) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, Language.field4410);
				class6 var30 = class221.method4305()[var2.readUnsignedByte()];

				try {
					class3 var31 = WorldMapElement.method3590(var30);
					this.field542 = new class7(var2, var31);
					class19.updateLoginState(9);
				} catch (Exception var16) {
					class149.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field542.method51()) {
				this.field702 = this.field542.method52();
				this.field542.method62();
				this.field542 = null;
				if (this.field702 == null) {
					class149.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var26 = HorizontalAlignment.method3686();
				var26.packetBuffer.writeByte(LoginPacket.field3379.id);
				var26.packetBuffer.writeShort(this.field702.offset);
				var26.packetBuffer.writeBuffer(this.field702);
				packetWriter.addNode(var26);
				packetWriter.flush();
				this.field702 = null;
				class19.updateLoginState(6);
			}

			if (loginState == 10 && var1.available() > 0) {
				class223.field2351 = var1.readUnsignedByte();
				class19.updateLoginState(11);
			}

			if (loginState == 11 && var1.available() >= class223.field2351) {
				var1.read(var2.array, 0, class223.field2351);
				var2.offset = 0;
				class19.updateLoginState(6);
			}

			if (loginState == 12 && var1.available() > 0) {
				field675 = (var1.readUnsignedByte() + 3) * 60;
				class19.updateLoginState(13);
			}

			if (loginState == 13) {
				field522 = 0;
				class139.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field675 / 60 + " seconds.");
				if (--field675 <= 0) {
					class19.updateLoginState(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) {
					SoundCache.field303 = var1.readUnsignedByte();
					class19.updateLoginState(15);
				}

				if (loginState == 15 && var1.available() >= SoundCache.field303) {
					boolean var38 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var37 = false;
					if (var38) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						WorldMapIcon_1.clientPreferences.put(Login.Login_username, var13);
					}

					if (Login_isUsernameRemembered) {
						WorldMapIcon_1.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						WorldMapIcon_1.clientPreferences.updateRememberedUsername((String)null);
					}

					TextureProvider.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field754 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					if (revision >= 214) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						var2.readLong();
					}

					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var35 = class12.ServerPacket_values();
					var6 = var2.readSmartByteShortIsaac();
					if (var6 < 0 || var6 >= var35.length) {
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var35[var6];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method394(SpriteMask.client, "zap");
					} catch (Throwable var15) {
					}

					class19.updateLoginState(16);
				}

				if (loginState == 16) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7926();
						class53.method1110();
						Players.updatePlayer(var2);
						DefaultsGroup.field4740 = -1;
						GrandExchangeOfferUnitPriceComparator.loadRegions(false, var2, revision >= 218);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						GrandExchangeOfferOwnWorldComparator.field478 = var2.readUnsignedShort();
						class19.updateLoginState(18);
					}

					if (loginState == 18 && var1.available() >= GrandExchangeOfferOwnWorldComparator.field478) {
						var2.offset = 0;
						var1.read(var2.array, 0, GrandExchangeOfferOwnWorldComparator.field478);
						var2.offset = 0;
						String var34 = var2.readStringCp1252NullTerminated();
						String var33 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						class139.setLoginResponseString(var34, var33, var36);
						WorldMapSection2.updateGameState(10);
						if (field526.method9577()) {
							UserComparator7.method2966(9);
						}
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (var1.available() < 2) {
								return;
							}

							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (var1.available() >= packetWriter.serverPacketLength) {
							var1.read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var12 = packetWriter.serverPacketLength;
							timer.method7928();
							class17.method263();
							Players.updatePlayer(var2);
							if (var12 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field522;
						if (field522 > 2000) {
							if (field614 < 1) {
								if (WorldMapCacheName.worldPort == class252.currentPort) {
									class252.currentPort = AbstractSocket.js5Port;
								} else {
									class252.currentPort = WorldMapCacheName.worldPort;
								}

								++field614;
								class19.updateLoginState(0);
							} else {
								class149.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field614 < 1) {
				if (WorldMapCacheName.worldPort == class252.currentPort) {
					class252.currentPort = AbstractSocket.js5Port;
				} else {
					class252.currentPort = WorldMapCacheName.worldPort;
				}

				++field614;
				class19.updateLoginState(0);
			} else {
				class149.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-614967617"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			class9.method85();
		} else {
			if (!isMenuOpen) {
				UserComparator10.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (class216.method4239()) {
					var14 = class113.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					class415.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (timer.field4596) {
					var14 = class113.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method7927();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				PacketBuffer var10000;
				synchronized(Message.mouseRecorder.lock) {
					if (!field729) {
						Message.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Message.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < Message.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = Message.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = Message.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field501 || var8 != field502) {
								if (var15 == null) {
									var15 = class113.getPacketBufferNode(ClientPacket.field3197, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field503) {
									var10 = var9 - field501;
									var11 = var8 - field502;
									var12 = (int)((Message.mouseRecorder.millis[var7] - field503) / 20L);
									var5 = (int)((long)var5 + (Message.mouseRecorder.millis[var7] - field503) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field501 = var9;
								field502 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var15.packetBuffer.writeByte(var12 + 128);
									var15.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var15.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field503 = Message.mouseRecorder.millis[var7];
							}
						}

						if (var15 != null) {
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
							var7 = var15.packetBuffer.offset;
							var15.packetBuffer.offset = var3;
							var15.packetBuffer.writeByte(var5 / var6);
							var15.packetBuffer.writeByte(var5 % var6);
							var15.packetBuffer.offset = var7;
							packetWriter.addNode(var15);
						}

						if (var4 >= Message.mouseRecorder.index) {
							Message.mouseRecorder.index = 0;
						} else {
							MouseRecorder var52 = Message.mouseRecorder;
							var52.index -= var4;
							System.arraycopy(Message.mouseRecorder.xs, var4, Message.mouseRecorder.xs, 0, Message.mouseRecorder.index);
							System.arraycopy(Message.mouseRecorder.ys, var4, Message.mouseRecorder.ys, 0, Message.mouseRecorder.index);
							System.arraycopy(Message.mouseRecorder.millis, var4, Message.mouseRecorder.millis, 0, Message.mouseRecorder.index);
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class47.canvasHeight) {
						var3 = class47.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > Language.canvasWidth) {
						var4 = Language.canvasWidth;
					}

					var5 = (int)var16;
					PacketBufferNode var18 = class113.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (mouseWheelRotation != 0) {
					var14 = class113.getPacketBufferNode(ClientPacket.field3171, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var14);
				}

				if (field724.field2354 > 0) {
					var14 = class113.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = SpotAnimationDefinition.method3775();

					for (var5 = 0; var5 < field724.field2354; ++var5) {
						long var21 = var19 - field638;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field638 = var19;
						var14.packetBuffer.writeMediumLE((int)var21);
						var14.packetBuffer.writeByteNeg(field724.field2353[var5]);
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field523 > 0) {
					--field523;
				}

				if (field724.method4316(96) || field724.method4316(97) || field724.method4316(98) || field724.method4316(99)) {
					field587 = true;
				}

				if (field587 && field523 <= 0) {
					field523 = 20;
					field587 = false;
					var14 = class113.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var14.packetBuffer.writeShortLE(camAngleX);
					var14.packetBuffer.writeShortLE(camAngleY);
					packetWriter.addNode(var14);
				}

				if (class357.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = class113.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if (!class357.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = class113.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (NpcOverrides.worldMap != null) {
					NpcOverrides.worldMap.method8713();
				}

				if (class344.ClanChat_inClanChat) {
					if (class20.friendsChat != null) {
						class20.friendsChat.sort();
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) {
						Player var35 = players[Players.Players_indices[var1]];
						var35.clearIsInFriendsChat();
					}

					class344.ClanChat_inClanChat = false;
				}

				class153.method3311();
				class435.method8025();
				if (gameState == 30) {
					for (PendingSpawn var34 = (PendingSpawn)pendingSpawns.last(); var34 != null; var34 = (PendingSpawn)pendingSpawns.previous()) {
						if (var34.hitpoints > 0) {
							--var34.hitpoints;
						}

						if (var34.hitpoints == 0) {
							if (var34.objectId >= 0) {
								var3 = var34.objectId;
								var4 = var34.field1158;
								ObjectComposition var23 = WorldMapSection2.getObjectDefinition(var3);
								if (var4 == 11) {
									var4 = 10;
								}

								if (var4 >= 5 && var4 <= 8) {
									var4 = 4;
								}

								boolean var30 = var23.method3892(var4);
								if (!var30) {
									continue;
								}
							}

							WorldMapAreaData.addPendingSpawnToScene(var34.plane, var34.type, var34.x, var34.y, var34.objectId, var34.field1157, var34.field1158, var34.field1152);
							var34.remove();
						} else {
							if (var34.delay > 0) {
								--var34.delay;
							}

							if (var34.delay == 0 && var34.x >= 1 && var34.y >= 1 && var34.x <= 102 && var34.y <= 102 && (var34.field1162 < 0 || class141.method3211(var34.field1162, var34.field1161))) {
								WorldMapAreaData.addPendingSpawnToScene(var34.plane, var34.type, var34.x, var34.y, var34.field1162, var34.field1160, var34.field1161, var34.field1152);
								var34.delay = -1;
								if (var34.field1162 == var34.objectId && var34.objectId == -1) {
									var34.remove();
								} else if (var34.field1162 == var34.objectId && var34.field1157 == var34.field1160 && var34.field1161 == var34.field1158) {
									var34.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var37 = soundEffects[var1];
							if (var37 == null) {
								var10000 = null;
								var37 = SoundEffect.readSoundEffect(Language.field4412, soundEffectIds[var1], 0);
								if (var37 == null) {
									continue;
								}

								int[] var53 = queuedSoundEffectDelays;
								var53[var1] += var37.calculateDelay();
								soundEffects[var1] = var37;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = var5 * 128 + 64 - class229.localPlayer.x;
									if (var6 < 0) {
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255;
									var8 = var7 * 128 + 64 - class229.localPlayer.y;
									if (var8 < 0) {
										var8 = -var8;
									}

									var9 = var8 + var6 - 128;
									if (var9 > var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									if (var9 < 0) {
										var9 = 0;
									}

									var3 = (var4 - var9) * WorldMapIcon_1.clientPreferences.getAreaSoundEffectsVolume() / var4;
								} else {
									var3 = WorldMapIcon_1.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									RawSound var24 = var37.toRawSound().resample(class521.decimator);
									RawPcmStream var44 = RawPcmStream.createRawPcmStream(var24, 100, var3);
									var44.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									LoginScreenAnimation.pcmStreamMixer.addSubStream(var44);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
							}

							--var1;
						}
					}

					if (playingJingle && !BuddyRankComparator.method3006()) {
						if (WorldMapIcon_1.clientPreferences.getMusicVolume() != 0) {
							boolean var31 = !class316.field3424.isEmpty();
							if (var31) {
								class72.method2137(class514.archive6, WorldMapIcon_1.clientPreferences.getMusicVolume());
							}
						}

						playingJingle = false;
					}

					++packetWriter.field1412;
					if (packetWriter.field1412 > 750) {
						class9.method85();
					} else {
						var1 = Players.Players_count;
						int[] var39 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var46 = players[var39[var3]];
							if (var46 != null) {
								class228.updateActorSequence(var46, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var2 = npcIndices[var1];
							NPC var25 = npcs[var2];
							if (var25 != null) {
								class228.updateActorSequence(var25, var25.definition.size);
							}
						}

						int[] var36 = Players.Players_indices;

						for (var2 = 0; var2 < Players.Players_count; ++var2) {
							Player var50 = players[var36[var2]];
							if (var50 != null && var50.overheadTextCyclesRemaining > 0) {
								--var50.overheadTextCyclesRemaining;
								if (var50.overheadTextCyclesRemaining == 0) {
									var50.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) {
							var3 = npcIndices[var2];
							NPC var47 = npcs[var3];
							if (var47 != null && var47.overheadTextCyclesRemaining > 0) {
								--var47.overheadTextCyclesRemaining;
								if (var47.overheadTextCyclesRemaining == 0) {
									var47.overheadText = null;
								}
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var38 = Interpreter.mousedOverWidgetIf1;
						Widget var41 = SwapSongTask.field4539;
						Interpreter.mousedOverWidgetIf1 = null;
						SwapSongTask.field4539 = null;
						draggedOnWidget = null;
						field516 = false;
						field674 = false;
						field726 = 0;

						while (field724.method4324() && field726 < 128) {
							if (staffModLevel >= 2 && field724.method4316(82) && field724.field2360 == 66) {
								String var51 = class250.method4935();
								SpriteMask.client.method501(var51);
							} else if (oculusOrbState != 1 || field724.field2363 <= 0) {
								field518[field726] = field724.field2360;
								field586[field726] = field724.field2363;
								++field726;
							}
						}

						boolean var32 = staffModLevel >= 2;
						PacketBufferNode var26;
						if (var32 && field724.method4316(82) && field724.method4316(81) && mouseWheelRotation != 0) {
							var4 = class229.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class229.localPlayer.plane) {
								var5 = class229.localPlayer.pathX[0] + NpcOverrides.baseX * 64;
								var6 = class229.localPlayer.pathY[0] + class101.baseY * 64;
								var26 = class113.getPacketBufferNode(ClientPacket.field3223, packetWriter.isaacCipher);
								var26.packetBuffer.writeInt(0);
								var26.packetBuffer.writeShortAddLE(var5);
								var26.packetBuffer.writeShortAddLE(var6);
								var26.packetBuffer.writeByte(var4);
								packetWriter.addNode(var26);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class406.updateRootInterface(rootInterface, 0, 0, Language.canvasWidth, class47.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var40;
							Widget var45;
							ScriptEvent var49;
							do {
								var49 = (ScriptEvent)scriptEvents2.removeLast();
								if (var49 == null) {
									while (true) {
										do {
											var49 = (ScriptEvent)scriptEvents3.removeLast();
											if (var49 == null) {
												while (true) {
													do {
														var49 = (ScriptEvent)scriptEvents.removeLast();
														if (var49 == null) {
															boolean var33 = false;

															while (true) {
																class222 var48 = (class222)field682.removeLast();
																if (var48 == null) {
																	if (!var33 && MouseHandler.MouseHandler_lastButton == 1) {
																		field725.method4281();
																	}

																	this.menu();
																	class127.method3038();
																	if (clickedWidget != null) {
																		this.method1727();
																	}

																	if (Scene.shouldSendWalk()) {
																		var5 = Scene.Scene_selectedX;
																		var6 = Scene.Scene_selectedY;
																		var26 = class113.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var26.packetBuffer.writeByte(5);
																		var26.packetBuffer.writeShort(NpcOverrides.baseX * 64 + var5);
																		var26.packetBuffer.writeShortLE(class101.baseY * 64 + var6);
																		var26.packetBuffer.writeByteSub(field724.method4316(82) ? (field724.method4316(81) ? 2 : 1) : 0);
																		packetWriter.addNode(var26);
																		Scene.method5365();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var5;
																		destinationY = var6;
																	}

																	if (var38 != Interpreter.mousedOverWidgetIf1) {
																		if (var38 != null) {
																			class159.invalidateWidget(var38);
																		}

																		if (Interpreter.mousedOverWidgetIf1 != null) {
																			class159.invalidateWidget(Interpreter.mousedOverWidgetIf1);
																		}
																	}

																	if (var41 != SwapSongTask.field4539 && field648 == field768) {
																		if (var41 != null) {
																			class159.invalidateWidget(var41);
																		}

																		if (SwapSongTask.field4539 != null) {
																			class159.invalidateWidget(SwapSongTask.field4539);
																		}
																	}

																	if (SwapSongTask.field4539 != null) {
																		if (field648 < field768) {
																			++field648;
																			if (field768 == field648) {
																				class159.invalidateWidget(SwapSongTask.field4539);
																			}
																		}
																	} else if (field648 > 0) {
																		--field648;
																	}

																	class336.method6302();
																	if (field482) {
																		TextureProvider.method5533();
																	} else if (isCameraLocked) {
																		if (!field748) {
																			var5 = ScriptFrame.field456 * 16384 + 64;
																			var6 = class216.field2314 * 128 + 64;
																			var7 = WorldMapDecorationType.getTileHeight(var5, var6, ItemLayer.Client_plane) - class127.field1488;
																			class314.method5953(var5, var7, var6);
																		} else if (field751 != null) {
																			ViewportMouse.cameraX = field751.vmethod8673();
																			class36.cameraZ = field751.vmethod8674();
																			if (field661) {
																				SecureRandomFuture.cameraY = field751.vmethod8675();
																			} else {
																				SecureRandomFuture.cameraY = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - field751.vmethod8675();
																			}

																			field751.method8684();
																		}

																		if (!field749) {
																			var5 = Messages.field1400 * 16384 + 64;
																			var6 = AbstractWorldMapData.field2575 * 128 + 64;
																			var7 = WorldMapDecorationType.getTileHeight(var5, var6, ItemLayer.Client_plane) - class302.field3119;
																			var8 = var5 - ViewportMouse.cameraX;
																			var9 = var7 - SecureRandomFuture.cameraY;
																			var10 = var6 - class36.cameraZ;
																			var11 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
																			var12 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
																			int var27 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
																			class303.method5908(var12, var27);
																		} else {
																			if (field672 != null) {
																				Varcs.cameraPitch = field672.method8668();
																				Varcs.cameraPitch = Math.min(Math.max(Varcs.cameraPitch, 128), 383);
																				field672.method8684();
																			}

																			if (field752 != null) {
																				class192.cameraYaw = field752.method8668() & 2047;
																				field752.method8684();
																			}
																		}
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		var10002 = field728[var5]++;
																	}

																	class176.varcs.tryWrite();
																	var5 = InterfaceParent.method2351();
																	var6 = class181.method3656();
																	if (var5 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		WorldMapEvent.method5097(14500);
																		var26 = class113.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var26);
																	}

																	class12.friendSystem.processFriendUpdates();

																	for (var7 = 0; var7 < field500.size(); ++var7) {
																		if (MouseRecorder.method2372((Integer)field500.get(var7)) != 2) {
																			field500.remove(var7);
																			--var7;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var26 = class113.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var26);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var28) {
																		class9.method85();
																	}

																	return;
																}

																if (var48.field2349.type == 12) {
																	var33 = true;
																}

																if (var48 != null && var48.field2349 != null) {
																	if (var48.field2349.childIndex >= 0) {
																		var40 = HealthBarDefinition.widgetDefinition.method6285(var48.field2349.parentId);
																		if (var40 == null || var40.children == null || var40.children.length == 0 || var48.field2349.childIndex >= var40.children.length || var48.field2349 != var40.children[var48.field2349.childIndex]) {
																			continue;
																		}
																	}

																	if (var48.field2349.type == 11 && var48.field2344 == 0) {
																		if (var48.field2349.method6723(var48.field2346, var48.field2347, 0, 0)) {
																			switch(var48.field2349.method6681()) {
																			case 0:
																				HealthBar.openURL(var48.field2349.method6683(), true, false);
																				break;
																			case 1:
																				if (ClanChannel.method3483(class361.getWidgetFlags(var48.field2349))) {
																					int[] var43 = var48.field2349.method6684();
																					if (var43 != null) {
																						var26 = class113.getPacketBufferNode(ClientPacket.field3167, packetWriter.isaacCipher);
																						var26.packetBuffer.writeIntLE(var43[1]);
																						var26.packetBuffer.writeInt(var43[0]);
																						var26.packetBuffer.writeShortAdd(var48.field2349.childIndex);
																						var26.packetBuffer.writeInt(var43[2]);
																						var26.packetBuffer.writeIntLE(var48.field2349.id);
																						var26.packetBuffer.writeIntME(var48.field2349.method6689());
																						packetWriter.addNode(var26);
																					}
																				}
																			}
																		}
																	} else if (var48.field2349.type == 12) {
																		class341 var42 = var48.field2349.method6688();
																		if (var42 != null && var42.method6409()) {
																			switch(var48.field2344) {
																			case 0:
																				field725.method4279(var48.field2349);
																				var42.method6361(true);
																				var42.method6400(var48.field2346, var48.field2347, field724.method4316(82), field724.method4316(81));
																				break;
																			case 1:
																				var42.method6401(var48.field2346, var48.field2347);
																			}
																		}
																	}
																}
															}
														}

														var45 = var49.widget;
														if (var45.childIndex < 0) {
															break;
														}

														var40 = HealthBarDefinition.widgetDefinition.method6285(var45.parentId);
													} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]);

													class157.runScriptEvent(var49);
												}
											}

											var45 = var49.widget;
											if (var45.childIndex < 0) {
												break;
											}

											var40 = HealthBarDefinition.widgetDefinition.method6285(var45.parentId);
										} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]);

										class157.runScriptEvent(var49);
									}
								}

								var45 = var49.widget;
								if (var45.childIndex < 0) {
									break;
								}

								var40 = HealthBarDefinition.widgetDefinition.method6285(var45.parentId);
							} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]);

							class157.runScriptEvent(var49);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1786579284"
	)
	public void vmethod6202(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && WorldMapIcon_1.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3185, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = Language.canvasWidth;
		int var2 = class47.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (WorldMapIcon_1.clientPreferences != null) {
			try {
				class26.method396(SpriteMask.client, "resize", new Object[]{ApproximateRouteStrategy.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			ClanChannel.method3471(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field785[var1] = true;
			}

			field515[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field557 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Canvas.drawWidgets(rootInterface, 0, 0, Language.canvasWidth, class47.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				VarpDefinition.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				VarpDefinition.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				class478.method8608(viewportX, viewportY);
			}
		} else {
			ClanSettings.method3333();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field515[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field785[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		IgnoreList.method8061(ItemLayer.Client_plane, class229.localPlayer.x, class229.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lef;II)Z",
		garbageValue = "-2137639716"
	)
	boolean method1284(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class20.friendsChat = null;
		} else {
			if (class20.friendsChat == null) {
				class20.friendsChat = new FriendsChat(class89.loginType, SpriteMask.client);
			}

			class20.friendsChat.method8087(var1.packetBuffer, var2);
		}

		field692 = cycleCntr;
		class344.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lef;B)Z",
		garbageValue = "-16"
	)
	boolean method1576(PacketWriter var1) {
		if (class20.friendsChat != null) {
			class20.friendsChat.method8088(var1.packetBuffer);
		}

		field692 = cycleCntr;
		class344.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lef;B)Z",
		garbageValue = "1"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var20;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1411) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1412 = 0;
						var1.field1411 = false;
					}

					var3.offset = 0;
					if (var3.method9206()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1412 = 0;
					}

					var1.field1411 = true;
					ServerPacket[] var4 = class12.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1412 = 0;
				timer.method7923();
				var1.field1416 = var1.field1409;
				var1.field1409 = var1.field1414;
				var1.field1414 = var1.serverPacket;
				String var52;
				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var20 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(var3)));
					GrandExchangeOfferUnitPriceComparator.addGameMessage(6, var52, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3291 == var1.serverPacket) {
					class106.method2777(class306.field3227);
					var1.serverPacket = null;
					return true;
				}

				byte var76;
				if (ServerPacket.field3313 == var1.serverPacket) {
					class316.method5982();
					var76 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var76 >= 0) {
							currentClanSettings[var76] = null;
						} else {
							class478.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var76 >= 0) {
						currentClanSettings[var76] = new ClanSettings(var3);
					} else {
						class478.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var9;
				int var11;
				int var21;
				int var23;
				long var63;
				InterfaceParent var75;
				if (ServerPacket.field3274 == var1.serverPacket) {
					var21 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1290(false);
						class130.method3095(rootInterface);
						class106.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var59;
					for (; var6-- > 0; var59.field1047 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var59 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var59 != null && var8 != var59.group) {
							class302.closeInterface(var59, true);
							var59 = null;
						}

						if (var59 == null) {
							var59 = UserComparator8.openInterface(var7, var8, var9);
						}
					}

					for (var75 = (InterfaceParent)interfaceParents.first(); var75 != null; var75 = (InterfaceParent)interfaceParents.next()) {
						if (var75.field1047) {
							var75.field1047 = false;
						} else {
							class302.closeInterface(var75, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var21) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var23 = var3.readInt();

						for (var11 = var8; var11 <= var9; ++var11) {
							var63 = ((long)var7 << 32) + (long)var11;
							widgetFlags.put(new IntegerNode(var23), var63);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3271 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class460.queueSoundEffect(var21, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				int var24;
				boolean var62;
				boolean var82;
				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field482 = false;
					field748 = true;
					ScriptFrame.field456 = var3.readUnsignedByte() * 128;
					class216.field2314 = var3.readUnsignedByte() * 16384;
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var6 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field661 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = ScriptFrame.field456 * 16384 + 64;
					var23 = class216.field2314 * 128 + 64;
					var62 = false;
					var82 = false;
					if (field661) {
						var11 = SecureRandomFuture.cameraY;
						var24 = WorldMapDecorationType.getTileHeight(var9, var23, ItemLayer.Client_plane) - var21;
					} else {
						var11 = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - SecureRandomFuture.cameraY;
						var24 = var21;
					}

					field751 = new class488(ViewportMouse.cameraX, class36.cameraZ, var11, var9, var23, var24, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteSub();
					tradeChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				Widget var25;
				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntME();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var5);
					if (var25 != null && var25.type == 0) {
						if (var21 > var25.scrollHeight - var25.height) {
							var21 = var25.scrollHeight - var25.height;
						}

						if (var21 < 0) {
							var21 = 0;
						}

						if (var21 != var25.scrollY) {
							var25.scrollY = var21;
							class159.invalidateWidget(var25);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class90.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3364 == var1.serverPacket) {
					field677 = null;
					var1.serverPacket = null;
					return true;
				}

				boolean var98;
				if (ServerPacket.field3289 == var1.serverPacket) {
					var98 = var3.readBoolean();
					if (var98) {
						if (MidiPcmStream.field3456 == null) {
							MidiPcmStream.field3456 = new class381();
						}
					} else {
						MidiPcmStream.field3456 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3298 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntME();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var5);
					if (var25.modelType != 6 || var21 != var25.modelId) {
						var25.modelType = 6;
						var25.modelId = var21;
						class159.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3328 == var1.serverPacket) {
					return this.method1284(var1, 1);
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class153.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var21] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var21] = new GrandExchangeOffer(var3, false);
					}

					field551 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3325 == var1.serverPacket) {
					class106.method2777(class306.field3235);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					Interpreter.updatePlayers(var3, var1.serverPacketLength);
					WorldMapSectionType.method4889();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < Varps.Varps_main.length; ++var21) {
						if (Varps.Varps_main[var21] != Varps.Varps_temp[var21]) {
							Varps.Varps_main[var21] = Varps.Varps_temp[var21];
							Projectile.changeGameOptions(var21);
							changedVarps[++changedVarpCount - 1 & 31] = var21;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var21 = var3.readInt();
					InterfaceParent var80 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var80 != null) {
						class302.closeInterface(var80, true);
					}

					if (meslayerContinueWidget != null) {
						class159.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3251 == var1.serverPacket) {
					class316.method5982();
					var76 = var3.readByte();
					class147 var78 = new class147(var3);
					ClanSettings var91;
					if (var76 >= 0) {
						var91 = currentClanSettings[var76];
					} else {
						var91 = class478.guestClanSettings;
					}

					if (var91 == null) {
						this.method1295(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var78.field1655 > var91.field1701) {
						this.method1295(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var78.field1655 < var91.field1701) {
						var1.serverPacket = null;
						return true;
					}

					var78.method3252(var91);
					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var65;
				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByteNeg();
					var23 = var9 >> 2;
					var11 = var9 & 3;
					var24 = field563[var23];
					var65 = var3.readUnsignedShort();
					var6 = var3.readMedium();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						if (var24 == 0) {
							BoundaryObject var68 = class36.scene.method5346(ItemLayer.Client_plane, var7, var8);
							if (var68 != null) {
								var15 = class232.Entity_unpackID(var68.tag);
								if (var23 == 2) {
									var68.renderable1 = new DynamicObject(var15, 2, var11 + 4, ItemLayer.Client_plane, var7, var8, var65, false, var68.renderable1);
									var68.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, ItemLayer.Client_plane, var7, var8, var65, false, var68.renderable2);
								} else {
									var68.renderable1 = new DynamicObject(var15, var23, var11, ItemLayer.Client_plane, var7, var8, var65, false, var68.renderable1);
								}
							}
						} else if (var24 == 1) {
							WallDecoration var67 = class36.scene.method5347(ItemLayer.Client_plane, var7, var8);
							if (var67 != null) {
								var15 = class232.Entity_unpackID(var67.tag);
								if (var23 != 4 && var23 != 5) {
									if (var23 == 6) {
										var67.renderable1 = new DynamicObject(var15, 4, var11 + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1);
									} else if (var23 == 7) {
										var67.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1);
									} else if (var23 == 8) {
										var67.renderable1 = new DynamicObject(var15, 4, var11 + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1);
										var67.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable2);
									}
								} else {
									var67.renderable1 = new DynamicObject(var15, 4, var11, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1);
								}
							}
						} else if (var24 == 2) {
							GameObject var64 = class36.scene.getGameObject(ItemLayer.Client_plane, var7, var8);
							if (var23 == 11) {
								var23 = 10;
							}

							if (var64 != null) {
								var64.renderable = new DynamicObject(class232.Entity_unpackID(var64.tag), var23, var11, ItemLayer.Client_plane, var7, var8, var65, false, var64.renderable);
							}
						} else if (var24 == 3) {
							FloorDecoration var66 = class36.scene.getFloorDecoration(ItemLayer.Client_plane, var7, var8);
							if (var66 != null) {
								var66.renderable = new DynamicObject(class232.Entity_unpackID(var66.tag), 22, var11, ItemLayer.Client_plane, var7, var8, var65, false, var66.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var26;
				byte var57;
				byte var81;
				if (ServerPacket.field3270 == var1.serverPacket) {
					var15 = var3.readUnsignedShort();
					var17 = var3.readUnsignedByte();
					var6 = var3.readMedium();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var57 = var3.readByte();
					var16 = var3.readUnsignedShortAddLE();
					var24 = var3.readUnsignedShort();
					var11 = var3.method9313();
					var26 = var3.readUnsignedByteAdd() * 4;
					var65 = var3.readUnsignedByte() * 4;
					var18 = var3.readUnsignedShortAdd();
					var81 = var3.readByteAdd();
					var9 = var57 + var7;
					var23 = var81 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var23 >= 0 && var9 < 104 && var23 < 104 && var24 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var9 = var9 * 128 + 64;
						var23 = var23 * 128 + 64;
						var19 = new Projectile(var24, ItemLayer.Client_plane, var7, var8, WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var65, var15 + cycle, var16 + cycle, var17, var18, var11, var26);
						var19.setDestination(var9, var23, WorldMapDecorationType.getTileHeight(var9, var23, ItemLayer.Client_plane) - var26, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3342 == var1.serverPacket) {
					class106.method2777(class306.field3236);
					var1.serverPacket = null;
					return true;
				}

				Widget var22;
				if (ServerPacket.field3344 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readInt();
					var22 = HealthBarDefinition.widgetDefinition.method6285(var6);
					class306.method5915(var22, var21, var5);
					class159.invalidateWidget(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3295 == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedByteAdd();
					var75 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var75 != null) {
						class302.closeInterface(var75, var21 != var75.group);
					}

					UserComparator8.openInterface(var5, var21, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var25 = HealthBarDefinition.widgetDefinition.method6285(var21);
					} else {
						var25 = null;
					}

					if (var25 != null) {
						for (var7 = 0; var7 < var25.itemIds.length; ++var7) {
							var25.itemIds[var7] = 0;
							var25.itemQuantities[var7] = 0;
						}
					}

					class28.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedShortAdd();
						var23 = var3.readUnsignedByteAdd();
						if (var23 == 255) {
							var23 = var3.readInt();
						}

						if (var25 != null && var8 < var25.itemIds.length) {
							var25.itemIds[var8] = var9;
							var25.itemQuantities[var8] = var23;
						}

						class185.itemContainerSetItem(var5, var8, var9 - 1, var23);
					}

					if (var25 != null) {
						class159.invalidateWidget(var25);
					}

					class396.method7403();
					changedItemContainers[++field685 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				Widget var74;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var74 = HealthBarDefinition.widgetDefinition.method6285(var21);

					for (var6 = 0; var6 < var74.itemIds.length; ++var6) {
						var74.itemIds[var6] = -1;
						var74.itemIds[var6] = 0;
					}

					class159.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				long var27;
				long var29;
				String var34;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var90 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var3.readUnsignedByte());
					long var32 = (var27 << 32) + var29;
					var82 = false;

					for (var65 = 0; var65 < 100; ++var65) {
						if (crossWorldMessageIds[var65] == var32) {
							var82 = true;
							break;
						}
					}

					if (class12.friendSystem.isIgnored(new Username(var52, class89.loginType))) {
						var82 = true;
					}

					if (!var82 && field736 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var32;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(var3)));
						byte var87;
						if (var90.isPrivileged) {
							var87 = 7;
						} else {
							var87 = 3;
						}

						if (var90.modIcon != -1) {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var87, FloorUnderlayDefinition.method3799(var90.modIcon) + var52, var34);
						} else {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var87, var52, var34);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					PlayerCompositionColorTextureOverride.privateChatMode = WorldMapArea.method4580(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3250 == var1.serverPacket) {
					isCameraLocked = true;
					field482 = false;
					field749 = true;
					var21 = class319.method6186(var3.readShort() & 2027);
					var5 = class240.method4829(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field672 = new class490(Varcs.cameraPitch, var5, var6, var7);
					field752 = new class490(class192.cameraYaw, var21, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field697 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var21 = var3.readInt();
					var74 = HealthBarDefinition.widgetDefinition.method6285(var21);
					var74.modelType = 3;
					var74.modelId = class229.localPlayer.appearance.getChatHeadId();
					class159.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3308 == var1.serverPacket) {
					var21 = var3.method9305();
					var5 = var3.readInt();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var5);
					if (var21 != var25.sequenceId || var21 == -1) {
						var25.sequenceId = var21;
						var25.modelFrame = 0;
						var25.modelFrameCycle = 0;
						class159.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3366 == var1.serverPacket) {
					class396.method7403();
					runEnergy = var3.readUnsignedShort();
					field697 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var76 = var3.readByteNeg();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var76;
					if (Varps.Varps_main[var5] != var76) {
						Varps.Varps_main[var5] = var76;
					}

					Projectile.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3371 == var1.serverPacket) {
					return this.method1284(var1, 2);
				}

				if (ServerPacket.field3358 == var1.serverPacket) {
					class106.method2777(class306.field3234);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3319 == var1.serverPacket) {
					if (field677 == null) {
						field677 = new class466(Players.Widget_cachedFonts);
					}

					class535 var53 = Players.Widget_cachedFonts.method8534(var3);
					field677.field4799.vmethod9001(var53.field5204, var53.field5205);
					field688[++field689 - 1 & 31] = var53.field5204;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var5);
					if (var25.modelType != 1 || var21 != var25.modelId) {
						var25.modelType = 1;
						var25.modelId = var21;
						class159.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntME();
					var21 = var3.readUnsignedShortAdd();
					Player var95;
					if (var21 == localPlayerIndex) {
						var95 = class229.localPlayer;
					} else {
						var95 = players[var21];
					}

					if (var95 != null) {
						var95.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					WorldMapEvent.method5099(var21);
					changedItemContainers[++field685 - 1 & 31] = var21 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readInt();
					var6 = class167.getGcDuration();
					PacketBufferNode var79 = class113.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var79.packetBuffer.writeIntIME(var21);
					var79.packetBuffer.writeIntME(var5);
					var79.packetBuffer.writeByteNeg(var6);
					var79.packetBuffer.writeByte(GameEngine.fps);
					packetWriter.addNode(var79);
					var1.serverPacket = null;
					return true;
				}

				String var84;
				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByteSub();
					var84 = var3.readStringCp1252NullTerminated();
					if (var21 >= 1 && var21 <= 8) {
						if (var84.equalsIgnoreCase("null")) {
							var84 = null;
						}

						playerMenuActions[var21 - 1] = var84;
						playerOptionsPriorities[var21 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3339 == var1.serverPacket) {
					class12.friendSystem.method1929();
					field747 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3336 == var1.serverPacket) {
					field677 = new class466(Players.Widget_cachedFonts);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3280 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3321 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field755[var21] = true;
					field756[var21] = var5;
					field704[var21] = var6;
					field758[var21] = var7;
					field728[var21] = 0;
					var1.serverPacket = null;
					return true;
				}

				Widget var93;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAddLE();
					var93 = HealthBarDefinition.widgetDefinition.method6285(var5);
					if (var21 != var93.modelAngleX || var6 != var93.modelAngleY || var7 != var93.modelZoom) {
						var93.modelAngleX = var21;
						var93.modelAngleY = var6;
						var93.modelZoom = var7;
						class159.invalidateWidget(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3370 == var1.serverPacket) {
					class106.method2777(class306.field3228);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3343 == var1.serverPacket) {
					var21 = var3.readInt();
					if (var21 != field584) {
						field584 = var21;
						VerticalAlignment.method3756();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class12.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field747 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3332 == var1.serverPacket) {
					var98 = var3.readUnsignedByte() == 1;
					if (var98) {
						class489.field4905 = SpotAnimationDefinition.method3775() - var3.readLong();
						class6.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class6.grandExchangeEvents = null;
					}

					field782 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3248 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					if (var21 == 65535) {
						var21 = -1;
					}

					rootInterface = var21;
					this.method1290(false);
					class130.method3095(var21);
					class106.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var77 = npcs[var21];
					if (var77 != null) {
						if (var5 == var77.sequence && var5 != -1) {
							var8 = DynamicObject.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var77.sequenceFrame = 0;
								var77.sequenceFrameCycle = 0;
								var77.sequenceDelay = var6;
								var77.field1199 = 0;
							} else if (var8 == 2) {
								var77.field1199 = 0;
							}
						} else if (var5 == -1 || var77.sequence == -1 || DynamicObject.SequenceDefinition_get(var5).field2223 >= DynamicObject.SequenceDefinition_get(var77.sequence).field2223) {
							var77.sequence = var5;
							var77.sequenceFrame = 0;
							var77.sequenceFrameCycle = 0;
							var77.sequenceDelay = var6;
							var77.field1199 = 0;
							var77.field1220 = var77.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3304 == var1.serverPacket) {
					for (var21 = 0; var21 < players.length; ++var21) {
						if (players[var21] != null) {
							players[var21].sequence = -1;
						}
					}

					for (var21 = 0; var21 < npcs.length; ++var21) {
						if (npcs[var21] != null) {
							npcs[var21].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class90.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class13.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3367 == var1.serverPacket) {
					class396.method7403();
					weight = var3.readShort();
					field697 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3373 == var1.serverPacket) {
					class106.method2777(class306.field3231);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field482 = false;
					field748 = false;
					ScriptFrame.field456 = var3.readUnsignedByte() * 128;
					class216.field2314 = var3.readUnsignedByte() * 16384;
					class127.field1488 = var3.readUnsignedShort();
					WorldMapIcon_0.field2529 = var3.readUnsignedByte();
					class1.field2 = var3.readUnsignedByte();
					if (class1.field2 >= 100) {
						ViewportMouse.cameraX = ScriptFrame.field456 * 16384 + 64;
						class36.cameraZ = class216.field2314 * 128 + 64;
						SecureRandomFuture.cameraY = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - class127.field1488;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3353 == var1.serverPacket) {
					return this.method1576(var1);
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class336.method6303(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				long var36;
				if (ServerPacket.field3283 == var1.serverPacket) {
					var76 = var3.readByte();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					var36 = (var27 << 32) + var29;
					var62 = false;
					ClanChannel var96 = var76 >= 0 ? currentClanChannels[var76] : ItemContainer.guestClanChannel;
					if (var96 == null) {
						var62 = true;
					} else {
						for (var65 = 0; var65 < 100; ++var65) {
							if (var36 == crossWorldMessageIds[var65]) {
								var62 = true;
								break;
							}
						}
					}

					if (!var62) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = class128.method3076(var3);
						var26 = var76 >= 0 ? 43 : 46;
						ArchiveLoader.addChatMessage(var26, "", var34, var96.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3297 == var1.serverPacket) {
					var8 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortLE();
					var21 = var3.readUnsignedShortAddLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					ArrayList var31 = new ArrayList();
					var31.add(var21);
					class135.method3152(var31, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3258 == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var20 = var3.readStringCp1252NullTerminated();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var21);
					if (!var20.equals(var25.text)) {
						var25.text = var20;
						class159.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3306 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortAddLE();
					class191.method3758(var21, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class12.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					DelayFadeTask.FriendSystem_invalidateIgnoreds();
					field747 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3300 == var1.serverPacket) {
					class106.method2777(class306.field3230);
					var1.serverPacket = null;
					return true;
				}

				String var40;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var27 = var3.readLong();
					var29 = (long)var3.readUnsignedShort();
					var36 = (long)var3.readMedium();
					PlayerType var97 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var3.readUnsignedByte());
					var63 = (var29 << 32) + var36;
					boolean var85 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var63) {
							var85 = true;
							break;
						}
					}

					if (var97.isUser && class12.friendSystem.isIgnored(new Username(var52, class89.loginType))) {
						var85 = true;
					}

					if (!var85 && field736 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var63;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(var3)));
						if (var97.modIcon != -1) {
							ArchiveLoader.addChatMessage(9, FloorUnderlayDefinition.method3799(var97.modIcon) + var52, var40, HitSplatDefinition.base37DecodeLong(var27));
						} else {
							ArchiveLoader.addChatMessage(9, var52, var40, HitSplatDefinition.base37DecodeLong(var27));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					Object[] var73 = new Object[var52.length() + 1];

					for (var6 = var52.length() - 1; var6 >= 0; --var6) {
						if (var52.charAt(var6) == 's') {
							var73[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var73[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var73[0] = new Integer(var3.readInt());
					ScriptEvent var89 = new ScriptEvent();
					var89.args = var73;
					class157.runScriptEvent(var89);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3296 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					WorldMapIcon_1.method4514(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						class514.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3256 == var1.serverPacket && isCameraLocked) {
					field482 = true;
					field749 = false;
					field748 = false;

					for (var21 = 0; var21 < 5; ++var21) {
						field755[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					var5 = var3.readInt();
					var6 = var21 >> 10 & 31;
					var7 = var21 >> 5 & 31;
					var8 = var21 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var58 = HealthBarDefinition.widgetDefinition.method6285(var5);
					if (var9 != var58.color) {
						var58.color = var9;
						class159.invalidateWidget(var58);
					}

					var1.serverPacket = null;
					return true;
				}

				NPC var94;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var94 = npcs[var21];
					var6 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedByteAdd();
					if (var94 != null) {
						var94.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3305 == var1.serverPacket) {
					field588 = cycleCntr;
					var76 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var76 >= 0) {
							currentClanChannels[var76] = null;
						} else {
							ItemContainer.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var76 >= 0) {
						currentClanChannels[var76] = new ClanChannel(var3);
					} else {
						ItemContainer.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3259 == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					short var60 = (short)var3.readShort();
					var7 = var3.readUnsignedByteAdd();
					var94 = npcs[var5];
					if (var94 != null) {
						var94.method2666(var7, var21, var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class18.field85 = var3.readUnsignedByteSub();
					class6.field14 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var21 = var3.readUnsignedByte();
						class306 var72 = class520.method9189()[var21];
						class106.method2777(var72);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3293 == var1.serverPacket) {
					field588 = cycleCntr;
					var76 = var3.readByte();
					class161 var71 = new class161(var3);
					ClanChannel var88;
					if (var76 >= 0) {
						var88 = currentClanChannels[var76];
					} else {
						var88 = ItemContainer.guestClanChannel;
					}

					if (var88 == null) {
						this.method1294(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var71.field1752 > var88.field1772) {
						this.method1294(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var71.field1752 < var88.field1772) {
						var1.serverPacket = null;
						return true;
					}

					var71.method3437(var88);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3340 == var1.serverPacket) {
					class106.method2777(class306.field3225);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3294 == var1.serverPacket) {
					class106.method2777(class306.field3226);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class396.method7403();
					var21 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedByte();
					experience[var21] = var5;
					currentLevels[var21] = var6;
					levels[var21] = 1;
					field540[var21] = var6;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var21] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3285 == var1.serverPacket) {
					class106.method2777(class306.field3229);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3314 == var1.serverPacket) {
					class410.method7801(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				boolean var55;
				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var55 = var3.readUnsignedByte() == 1;
					var25 = HealthBarDefinition.widgetDefinition.method6285(var21);
					if (var55 != var25.isHidden) {
						var25.isHidden = var55;
						class159.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3260 == var1.serverPacket) {
					class106.method2777(class306.field3237);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3335 == var1.serverPacket) {
					class18.field85 = var3.readUnsignedByteAdd();
					class6.field14 = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < VarpDefinition.field1815; ++var21) {
						VarpDefinition var70 = FloorOverlayDefinition.VarpDefinition_get(var21);
						if (var70 != null) {
							Varps.Varps_temp[var21] = 0;
							Varps.Varps_main[var21] = 0;
						}
					}

					class396.method7403();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3301 == var1.serverPacket) {
					class106.method2777(class306.field3233);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var25 = HealthBarDefinition.widgetDefinition.method6285(var21);
					} else {
						var25 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class185.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var25 != null && var7 >= 0 && var7 < var25.itemIds.length) {
							var25.itemIds[var7] = var8;
							var25.itemQuantities[var7] = var9;
						}
					}

					if (var25 != null) {
						class159.invalidateWidget(var25);
					}

					class396.method7403();
					changedItemContainers[++field685 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var51 = new World();
					var51.host = var3.readStringCp1252NullTerminated();
					var51.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var51.properties = var5;
					if (var51.isDeadman()) {
						var51.field808 = "beta";
					}

					WorldMapSection2.updateGameState(45);
					var2.close();
					var2 = null;
					class28.changeWorld(var51);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var86 = (InterfaceParent)interfaceParents.get((long)var5);
					var75 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var75 != null) {
						class302.closeInterface(var75, var86 == null || var86.group != var75.group);
					}

					if (var86 != null) {
						var86.remove();
						interfaceParents.put(var86, (long)var21);
					}

					var93 = HealthBarDefinition.widgetDefinition.method6285(var5);
					if (var93 != null) {
						class159.invalidateWidget(var93);
					}

					var93 = HealthBarDefinition.widgetDefinition.method6285(var21);
					if (var93 != null) {
						class159.invalidateWidget(var93);
						class132.revalidateWidgetScroll(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var93.id >>> 16], var93, true);
					}

					if (rootInterface != -1) {
						class514.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3261 == var1.serverPacket) {
					isCameraLocked = true;
					field482 = false;
					field748 = true;
					ScriptFrame.field456 = var3.readUnsignedByte() * 128;
					class216.field2314 = var3.readUnsignedByte() * 16384;
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field661 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = ScriptFrame.field456 * 16384 + 64;
					var8 = class216.field2314 * 128 + 64;
					boolean var61 = false;
					boolean var83 = false;
					if (field661) {
						var9 = SecureRandomFuture.cameraY;
						var23 = WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var21;
					} else {
						var9 = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - SecureRandomFuture.cameraY;
						var23 = var21;
					}

					field751 = new class489(ViewportMouse.cameraX, class36.cameraZ, var9, var7, var8, var23, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3287 == var1.serverPacket) {
					var9 = var3.readUnsignedShortLE();
					var8 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShortAddLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					var7 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					ArrayList var56 = new ArrayList();
					var56.add(var21);
					var56.add(var5);
					class135.method3152(var56, var6, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					GrandExchangeOfferUnitPriceComparator.loadRegions(true, var1.packetBuffer, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var11 = var3.method9313();
					var26 = var3.readUnsignedByteSub() * 4;
					var24 = var3.readUnsignedShortAddLE();
					var6 = var3.method9418();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var15 = var3.readUnsignedShortLE();
					var57 = var3.readByte();
					var18 = var3.readUnsignedByteNeg();
					var16 = var3.readUnsignedShortAdd();
					var17 = var3.readUnsignedByteAdd();
					var81 = var3.readByteAdd();
					var65 = var3.readUnsignedByte() * 4;
					var9 = var57 + var7;
					var23 = var81 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var23 >= 0 && var9 < 104 && var23 < 104 && var24 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var9 = var9 * 128 + 64;
						var23 = var23 * 128 + 64;
						var19 = new Projectile(var24, ItemLayer.Client_plane, var7, var8, WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var65, var15 + cycle, var16 + cycle, var17, var18, var11, var26);
						var19.setDestination(var9, var23, WorldMapDecorationType.getTileHeight(var9, var23, ItemLayer.Client_plane) - var26, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					GrandExchangeOfferUnitPriceComparator.loadRegions(false, var1.packetBuffer, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3341 == var1.serverPacket) {
					GrandExchangeOfferUnitPriceComparator.loadRegions(false, var1.packetBuffer, true);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3323 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShortLE();
					WorldMapRenderer.method4769(var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var21 = var3.method9305();
					var5 = var3.method9307();
					var6 = var3.readUnsignedIntIME();
					var22 = HealthBarDefinition.widgetDefinition.method6285(var6);
					if (var5 != var22.rawX || var21 != var22.rawY || var22.xAlignment != 0 || var22.yAlignment != 0) {
						var22.rawX = var5;
						var22.rawY = var21;
						var22.xAlignment = 0;
						var22.yAlignment = 0;
						class159.invalidateWidget(var22);
						this.alignWidget(var22);
						if (var22.type == 0) {
							class132.revalidateWidgetScroll(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var6 >> 16], var22, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					if (var21 == 65535) {
						var21 = -1;
					}

					class102.playSong(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3284 == var1.serverPacket) {
					var21 = var3.method9310();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					FileSystem.method4224(var5, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3303 == var1.serverPacket) {
					isCameraLocked = true;
					field482 = false;
					field749 = true;
					var21 = var3.readShort();
					var5 = var3.readShort();
					var6 = class240.method4829(var5 + Varcs.cameraPitch & 2027);
					var7 = var21 + class192.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field672 = new class490(Varcs.cameraPitch, var6, var8, var9);
					field752 = new class490(class192.cameraYaw, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3316 == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedIntIME();
					var22 = HealthBarDefinition.widgetDefinition.method6285(var6);
					var22.field3716 = var5 + (var21 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class18.field85 = var3.readUnsignedByteAdd();
					class6.field14 = var3.readUnsignedByteAdd();

					for (var21 = class18.field85; var21 < class18.field85 + 8; ++var21) {
						for (var5 = class6.field14; var5 < class6.field14 + 8; ++var5) {
							if (groundItems[ItemLayer.Client_plane][var21][var5] != null) {
								groundItems[ItemLayer.Client_plane][var21][var5] = null;
								ClanSettings.updateItemPile(var21, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
						if (var50.x >= class18.field85 && var50.x < class18.field85 + 8 && var50.y >= class6.field14 && var50.y < class6.field14 + 8 && var50.plane == ItemLayer.Client_plane) {
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3317 == var1.serverPacket) {
					isCameraLocked = true;
					field482 = false;
					field749 = true;
					Messages.field1400 = var3.readUnsignedByte() * 128;
					AbstractWorldMapData.field2575 = var3.readUnsignedByte() * 16384;
					class302.field3119 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Messages.field1400 * 16384 + 64;
					var7 = AbstractWorldMapData.field2575 * 128 + 64;
					var8 = WorldMapDecorationType.getTileHeight(var6, var7, ItemLayer.Client_plane) - class302.field3119;
					var9 = var6 - ViewportMouse.cameraX;
					var23 = var8 - SecureRandomFuture.cameraY;
					var11 = var7 - class36.cameraZ;
					double var12 = Math.sqrt((double)(var9 * var9 + var11 * var11));
					var26 = class240.method4829((int)(Math.atan2((double)var23, var12) * 325.9490051269531D) & 2047);
					var15 = class319.method6186((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field672 = new class490(Varcs.cameraPitch, var26, var21, var5);
					field752 = new class490(class192.cameraYaw, var15, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3349 == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var55 = var3.readUnsignedByteSub() == 1;
					var25 = HealthBarDefinition.widgetDefinition.method6285(var21);
					class18.method290(var25, class229.localPlayer.appearance, var55);
					class159.invalidateWidget(var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3330 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readInt();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var5);
					class302.method5906(var25, class229.localPlayer.appearance.gender, var21);
					class159.invalidateWidget(var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var21 = var3.readUShortSmart();
					var55 = var3.readUnsignedByte() == 1;
					var84 = "";
					boolean var54 = false;
					if (var55) {
						var84 = var3.readStringCp1252NullTerminated();
						if (class12.friendSystem.isIgnored(new Username(var84, class89.loginType))) {
							var54 = true;
						}
					}

					String var92 = var3.readStringCp1252NullTerminated();
					if (!var54) {
						GrandExchangeOfferUnitPriceComparator.addGameMessage(var21, var84, var92);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedShortAddLE();
					var23 = var3.readUnsignedByteAdd();
					var6 = var3.readMedium();
					var21 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var21 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var11 = var3.readUnsignedShortLE();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var38 = new GraphicsObject(var9, ItemLayer.Client_plane, var7, var8, WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var23, var11, cycle);
						graphicsObjects.addFirst(var38);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3268 == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntLE();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var5);
					AbstractWorldMapData.method4899(var25, var21);
					class159.invalidateWidget(var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntLE();
					var22 = HealthBarDefinition.widgetDefinition.method6285(var6);
					ItemComposition var35;
					if (!var22.isIf3) {
						if (var5 == -1) {
							var22.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var35 = class214.ItemDefinition_get(var5).getCountObj(var21);
						var22.modelType = 4;
						var22.modelId = var5;
						var22.modelAngleX = var35.xan2d;
						var22.modelAngleY = var35.yan2d;
						var22.modelZoom = var35.zoom2d * 100 / var21;
						class159.invalidateWidget(var22);
					} else {
						var22.itemId = var5;
						var22.itemQuantity = var21;
						var35 = class214.ItemDefinition_get(var5).getCountObj(var21);
						var22.modelAngleX = var35.xan2d;
						var22.modelAngleY = var35.yan2d;
						var22.modelAngleZ = var35.zan2d;
						var22.modelOffsetX = var35.offsetX2d;
						var22.modelOffsetY = var35.offsetY2d;
						var22.modelZoom = var35.zoom2d;
						if (var35.isStackable == 1) {
							var22.itemQuantityMode = 1;
						} else {
							var22.itemQuantityMode = 2;
						}

						if (var22.field3684 > 0) {
							var22.modelZoom = var22.modelZoom * 32 / var22.field3684;
						} else if (var22.rawWidth > 0) {
							var22.modelZoom = var22.modelZoom * 32 / var22.rawWidth;
						}

						class159.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field482 = false;
					isCameraLocked = false;
					field748 = false;
					field749 = false;
					Messages.field1400 = 0;
					AbstractWorldMapData.field2575 = 0;
					class302.field3119 = 0;
					field661 = false;
					class60.field421 = 0;
					class134.field1581 = 0;
					class1.field2 = 0;
					WorldMapIcon_0.field2529 = 0;
					ScriptFrame.field456 = 0;
					class216.field2314 = 0;
					class127.field1488 = 0;
					field751 = null;
					field672 = null;
					field752 = null;

					for (var21 = 0; var21 < 5; ++var21) {
						field755[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var49 = new byte[var1.serverPacketLength];
					var3.method9208(var49, 0, var49.length);
					Buffer var69 = new Buffer(var49);
					var84 = var69.readStringCp1252NullTerminated();
					HealthBar.openURL(var84, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3249 == var1.serverPacket) {
					isCameraLocked = true;
					field482 = false;
					field749 = false;
					Messages.field1400 = var3.readUnsignedByte() * 128;
					AbstractWorldMapData.field2575 = var3.readUnsignedByte() * 16384;
					class302.field3119 = var3.readUnsignedShort();
					class60.field421 = var3.readUnsignedByte();
					class134.field1581 = var3.readUnsignedByte();
					if (class134.field1581 >= 100) {
						var21 = Messages.field1400 * 16384 + 64;
						var5 = AbstractWorldMapData.field2575 * 128 + 64;
						var6 = WorldMapDecorationType.getTileHeight(var21, var5, ItemLayer.Client_plane) - class302.field3119;
						var7 = var21 - ViewportMouse.cameraX;
						var8 = var6 - SecureRandomFuture.cameraY;
						var9 = var5 - class36.cameraZ;
						var23 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						Varcs.cameraPitch = (int)(Math.atan2((double)var8, (double)var23) * 325.9490051269531D) & 2047;
						class192.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (Varcs.cameraPitch < 128) {
							Varcs.cameraPitch = 128;
						}

						if (Varcs.cameraPitch > 383) {
							Varcs.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3276 == var1.serverPacket) {
					class396.method7403();
					var21 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByteNeg();
					experience[var6] = var5;
					currentLevels[var6] = var7;
					levels[var6] = 1;
					field540[var6] = var21;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var5 >= Skills.Skills_experienceTable[var8]) {
							levels[var6] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readInt();
					Varps.Varps_temp[var21] = var5;
					if (Varps.Varps_main[var21] != var5) {
						Varps.Varps_main[var21] = var5;
					}

					Projectile.changeGameOptions(var21);
					changedVarps[++changedVarpCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3288 == var1.serverPacket) {
					class106.method2777(class306.field3232);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3299 == var1.serverPacket) {
					var76 = var3.readByte();
					var20 = var3.readStringCp1252NullTerminated();
					long var41 = (long)var3.readUnsignedShort();
					long var43 = (long)var3.readMedium();
					PlayerType var10 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var3.readUnsignedByte());
					long var45 = var43 + (var41 << 32);
					boolean var13 = false;
					ClanChannel var14 = null;
					var14 = var76 >= 0 ? currentClanChannels[var76] : ItemContainer.guestClanChannel;
					if (var14 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var10.isUser && class12.friendSystem.isIgnored(new Username(var20, class89.loginType))) {
									var13 = true;
								}
								break;
							}

							if (var45 == crossWorldMessageIds[var15]) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(class128.method3076(var3));
						var16 = var76 >= 0 ? 41 : 44;
						if (var10.modIcon != -1) {
							ArchiveLoader.addChatMessage(var16, FloorUnderlayDefinition.method3799(var10.modIcon) + var20, var40, var14.name);
						} else {
							ArchiveLoader.addChatMessage(var16, var20, var40, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3359 == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedShort();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var8 = var7; var8 <= var5; ++var8) {
						var36 = ((long)var6 << 32) + (long)var8;
						Node var39 = widgetFlags.get(var36);
						if (var39 != null) {
							var39.remove();
						}

						widgetFlags.put(new IntegerNode(var21), var36);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3269 == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedByteSub();
					if (var21 == 65535) {
						var21 = -1;
					}

					WorldMapLabelSize.performPlayerAnimation(class229.localPlayer, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					var25 = HealthBarDefinition.widgetDefinition.method6285(var21);
					if (var25.modelType != 2 || var5 != var25.modelId) {
						var25.modelType = 2;
						var25.modelId = var5;
						class159.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					PacketWriter.forceDisconnect(var21);
					var1.serverPacket = null;
					return false;
				}

				GrandExchangeOfferWorldComparator.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1409 != null ? var1.field1409.id : -1) + "," + (var1.field1416 != null ? var1.field1416.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class13.logOut();
			} catch (IOException var47) {
				class9.method85();
			} catch (Exception var48) {
				var20 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1409 != null ? var1.field1409.id : -1) + "," + (var1.field1416 != null ? var1.field1416.id : -1) + "," + var1.serverPacketLength + "," + (class229.localPlayer.pathX[0] + NpcOverrides.baseX * 64) + "," + (class229.localPlayer.pathY[0] + class101.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var20 = var20 + var3.array[var6] + ",";
				}

				GrandExchangeOfferWorldComparator.RunException_sendStackTrace(var20, var48);
				class13.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1598980943"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var17 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var17;
					String var18 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var18;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					var5 = menuItemIds[var2];
					menuItemIds[var2] = menuItemIds[var2 + 1];
					menuItemIds[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (clickedWidget == null) {
			int var19 = MouseHandler.MouseHandler_lastButton;
			int var4;
			int var7;
			int var8;
			int var20;
			if (isMenuOpen) {
				int var3;
				if (var19 != 1 && (class19.mouseCam || var19 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < FriendSystem.menuX - 10 || var2 > FriendSystem.menuX + class428.menuWidth + 10 || var3 < class60.menuY - 10 || var3 > class515.menuHeight + class60.menuY + 10) {
						isMenuOpen = false;
						var4 = FriendSystem.menuX;
						var5 = class60.menuY;
						var20 = class428.menuWidth;
						var7 = class515.menuHeight;

						for (var8 = 0; var8 < rootWidgetCount; ++var8) {
							if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var20 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var7) {
								validRootWidgets[var8] = true;
							}
						}
					}
				}

				if (var19 == 1 || !class19.mouseCam && var19 == 4) {
					var2 = FriendSystem.menuX;
					var3 = class60.menuY;
					var4 = class428.menuWidth;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					var20 = MouseHandler.MouseHandler_lastPressedY;
					var7 = -1;

					int var15;
					for (var8 = 0; var8 < menuOptionsCount; ++var8) {
						var15 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
						if (var5 > var2 && var5 < var2 + var4 && var20 > var15 - 13 && var20 < var15 + 3) {
							var7 = var8;
						}
					}

					int var11;
					int var12;
					int var16;
					if (var7 != -1 && var7 >= 0) {
						var8 = menuArguments1[var7];
						var15 = menuArguments2[var7];
						var16 = menuOpcodes[var7];
						var11 = menuIdentifiers[var7];
						var12 = menuItemIds[var7];
						String var13 = menuActions[var7];
						String var14 = menuTargets[var7];
						class407.menuAction(var8, var15, var16, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					isMenuOpen = false;
					var8 = FriendSystem.menuX;
					var15 = class60.menuY;
					var16 = class428.menuWidth;
					var11 = class515.menuHeight;

					for (var12 = 0; var12 < rootWidgetCount; ++var12) {
						if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var16 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var15 && rootWidgetYs[var12] < var11 + var15) {
							validRootWidgets[var12] = true;
						}
					}
				}
			} else {
				var2 = menuOptionsCount - 1;
				if ((var19 == 1 || !class19.mouseCam && var19 == 4) && this.shouldLeftClickOpenMenu()) {
					var19 = 2;
				}

				if ((var19 == 1 || !class19.mouseCam && var19 == 4) && menuOptionsCount > 0 && var2 >= 0) {
					var4 = menuArguments1[var2];
					var5 = menuArguments2[var2];
					var20 = menuOpcodes[var2];
					var7 = menuIdentifiers[var2];
					var8 = menuItemIds[var2];
					String var9 = menuActions[var2];
					String var10 = menuTargets[var2];
					class407.menuAction(var4, var5, var20, var7, var8, var9, var10, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}

				if (var19 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1230030345"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		return (leftClickOpensMenu && menuOptionsCount > 2 || class514.method9121(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-26"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		Decimator.method1151(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class36.scene.menuOpen(ItemLayer.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-577799502"
	)
	final void method1290(boolean var1) {
		NPCComposition.method3748(rootInterface, Language.canvasWidth, class47.canvasHeight, var1);
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "1484692020"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : HealthBarDefinition.widgetDefinition.method6285(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = Language.canvasWidth;
			var4 = class47.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		Renderable.alignWidgetSize(var1, var3, var4, false);
		JagexCache.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-74"
	)
	final void method1727() {
		class159.invalidateWidget(clickedWidget);
		++class148.widgetDragDuration;
		if (field516 && field674) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field554) {
				var1 = field554;
			}

			if (var1 + clickedWidget.width > field554 + clickedWidgetParent.width) {
				var1 = field554 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field676) {
				var2 = field676;
			}

			if (var2 + clickedWidget.height > field676 + clickedWidgetParent.height) {
				var2 = field676 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field533;
			int var4 = var2 - field679;
			int var5 = clickedWidget.dragZoneSize;
			if (class148.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field554 + clickedWidgetParent.scrollX;
			int var7 = var2 - field676 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class157.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						class157.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class227.method4434(clickedWidget) != null) {
						PacketBufferNode var9 = class113.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var9.packetBuffer.writeShortLE(clickedWidget.itemId);
						var9.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex);
						var9.packetBuffer.writeIntME(clickedWidget.id);
						var9.packetBuffer.writeInt(draggedOnWidget.id);
						var9.packetBuffer.writeShortLE(clickedWidget.childIndex);
						var9.packetBuffer.writeShortAddLE(draggedOnWidget.itemId);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field533 + widgetClickX, field679 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					method1847(widgetClickX + field533, field679 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (class148.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					method1847(widgetClickX + field533, widgetClickY + field679);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)Lvj;",
		garbageValue = "-1748725154"
	)
	@Export("username")
	public Username username() {
		return class229.localPlayer != null ? class229.localPlayer.username : null;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1572672090"
	)
	void method1294(int var1) {
		if (revision >= 216) {
			PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3190, packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(var1);
			packetWriter.addNode(var2);
		}

	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1728239313"
	)
	void method1295(int var1) {
		if (revision >= 216) {
			PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3151, packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(var1);
			packetWriter.addNode(var2);
		}

	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							class85.clientLanguage = Language.method7190(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = class13.method173();
							int var6 = 0;

							GameBuild var8;
							while (true) {
								if (var6 >= var5.length) {
									var8 = null;
									break;
								}

								GameBuild var7 = var5[var6];
								if (var4 == var7.buildId) {
									var8 = var7;
									break;
								}

								++var6;
							}

							class191.field1978 = var8;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							MenuAction.field878 = var2;
							break;
						case 10:
							Messages.field1401 = (StudioGame)class12.findEnumerated(VerticalAlignment.method3755(), Integer.parseInt(var2));
							if (Messages.field1401 == StudioGame.oldscape) {
								class89.loginType = LoginType.oldscape;
							} else {
								class89.loginType = LoginType.field5027;
							}
							break;
						case 11:
							class314.authServiceBaseUrl = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							DevicePcmPlayerProvider.field111 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class228.field2415 = var2;
							break;
						case 21:
							field488 = Integer.parseInt(var2);
							break;
						case 22:
							FriendsChat.field4677 = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								revision = Integer.parseInt(var2);
							} else {
								revision = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				Friend.worldHost = this.getCodeBase().getHost();
				WorldMapSectionType.field2556 = new JagNetThread();
				String var9 = class191.field1978.name;
				byte var10 = 0;
				if ((worldProperties & class522.field5109.rsOrdinal()) != 0) {
					ItemLayer.field2655 = "beta";
				}

				try {
					class339.method6310("oldschool", ItemLayer.field2655, var9, var10, 23);
				} catch (Exception var12) {
					GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var12);
				}

				SpriteMask.client = this;
				RunException.field5299 = clientType;
				Messages.accessToken = System.getenv("JX_ACCESS_TOKEN");
				ObjectComposition.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				class369.sessionId = System.getenv("JX_SESSION_ID");
				InterfaceParent.characterId = System.getenv("JX_CHARACTER_ID");
				String var14 = System.getenv("JX_DISPLAY_NAME");
				String var11;
				if (var14 != null && !var14.isEmpty() && var14.charAt(0) != '#') {
					var11 = var14;
				} else {
					var11 = "";
				}

				Login.displayName = var11;
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field532 = true;
				}

				if (field490 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field490 = 0;
					} else {
						field490 = 5;
					}
				}

				this.startThread(765, 503, 218, 1);
			}
		} catch (RuntimeException var13) {
			throw CollisionMap.newRunException(var13, "client.init(" + ')');
		}
	}

	protected void finalize() throws Throwable {
		InterfaceParent.method2353(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			UserComparator7.method2966(10);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	public void setClient(int var1) {
		this.field545 = var1;
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)I",
		garbageValue = "80"
	)
	static int method1394(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "743374996"
	)
	public static void method1848() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2100775885"
	)
	static void method1847(int var0, int var1) {
		class59.method1177(class174.tempMenuAction, var0, var1);
		class174.tempMenuAction = null;
	}
}
