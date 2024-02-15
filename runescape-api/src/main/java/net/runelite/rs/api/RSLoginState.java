package net.runelite.rs.api;

import net.runelite.api.LoginState;
import net.runelite.mapping.Import;

public interface RSLoginState extends LoginState
{
	@Import("SHUTDOWN_PREVIOUS_CONNECTION")
	@Override
	RSLoginState SHUTDOWN_PREVIOUS_CONNECTION();

	@Import("INIT_MOUSEHANDLER_SOCKET")
	@Override
	RSLoginState INIT_MOUSEHANDLER_SOCKET();

	@Import("WRITE_INITIAL_LOGIN_PACKET")
	@Override
	RSLoginState WRITE_INITIAL_LOGIN_PACKET();

	@Import("READ_LOGIN_STATUS")
	@Override
	RSLoginState READ_LOGIN_STATUS();

	@Import("READ_RANDOM_VERIFICATION_NUMBER")
	@Override
	RSLoginState READ_RANDOM_VERIFICATION_NUMBER();

	@Import("READ_CLIENT_INFO_STATUS")
	@Override
	RSLoginState READ_CLIENT_INFO_STATUS();

	@Import("READ_DIGEST_PARSER_PACKET_SIZE")
	@Override
	RSLoginState READ_DIGEST_PARSER_PACKET_SIZE();

	@Import("SUBMIT_DIGEST_PARSER_TASK")
	@Override
	RSLoginState SUBMIT_DIGEST_PARSER_TASK();

	@Import("WRITE_DIGEST_PARSER_RESULT")
	@Override
	RSLoginState WRITE_DIGEST_PARSER_RESULT();

	@Import("READ_STATE_11_PACKET_SIZE")
	@Override
	RSLoginState READ_STATE_11_PACKET_SIZE();

	@Import("READ_PROFILE_TRANSFER_TIME")
	@Override
	RSLoginState READ_PROFILE_TRANSFER_TIME();

	@Import("PROFILE_TRANSFER")
	@Override
	RSLoginState PROFILE_TRANSFER();

	@Import("READ_ACCOUNT_INFO_PACKET_SIZE")
	@Override
	RSLoginState READ_ACCOUNT_INFO_PACKET_SIZE();

	@Import("READ_ACCOUNT_INFO")
	@Override
	RSLoginState READ_ACCOUNT_INFO();

	@Import("UPDATE_PLAYER_AND_LOAD_REGIONS")
	@Override
	RSLoginState UPDATE_PLAYER_AND_LOAD_REGIONS();

	@Import("REFRESHING_TOKEN")
	@Override
	RSLoginState REFRESHING_TOKEN();

	@Import("TOKEN_RESPONSE")
	@Override
	RSLoginState TOKEN_RESPONSE();

	@Import("SET_SERVER_PROTOCOL")
	@Override
	RSLoginState SET_SERVER_PROTOCOL();

	@Import("UNMAPPED")
	@Override
	RSLoginState UNMAPPED();

	@Import("UNMAPPED_11")
	@Override
	RSLoginState UNMAPPED_11();

	@Import("UNMAPPED_17")
	@Override
	RSLoginState UNMAPPED_17();

	@Import("UNMAPPED_18")
	@Override
	RSLoginState UNMAPPED_18();

	@Import("UNMAPPED_19")
	@Override
	RSLoginState UNMAPPED_19();

	@Import("UNMAPPED_20")
	@Override
	RSLoginState UNMAPPED_20();

	@Import("UNMAPPED_21")
	@Override
	RSLoginState UNMAPPED_21();
}