package com.moko.sw_ev.sw_emergency_version.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

import com.moko.sw_ev.sw_emergency_version.model.Gender;
import com.moko.sw_ev.sw_emergency_version.model.Privilege;
import com.moko.sw_ev.sw_emergency_version.model.User;

public class UserDataAccesService implements UserDao {

	private final JdbcTemplate jdbcTemplate;

	public UserDataAccesService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertUser(UUID idUser, User user) {
		return 0;
	}

	@Override
	public List<User> selectAllUsers() {
		final String sql = "SELECT id_user, first_name_user FROM tb_user";
		return jdbcTemplate.query(sql, (resultSet, i) -> {
			UUID id_user = UUID.fromString(resultSet.getString("id_user"));
			Gender gender_user = (Gender) resultSet.getObject("gender_user");
			String first_name_user = resultSet.getString("first_name_user");
			String last_name_user = resultSet.getString("last_name_user");
			int age_user = resultSet.getInt("age_user");
			String email_user = resultSet.getString("email_user");
			String occupation_user = resultSet.getString("occupation_user");
			Privilege privilege_user = (Privilege) resultSet.getObject("privilege_user");
			return new User(
				id_user, 
				gender_user, 
				first_name_user, 
				last_name_user, 
				age_user, 
				email_user, 
				occupation_user, 
				privilege_user
			);
		});
	}

	@Override
	public Optional<User> selectUserById(UUID id) {
		final String sql = "SELECT id_user, first_name_user FROM tb_user";
		User user = jdbcTemplate.queryForObject(
				sql, 
				new Object[] {id}, 
				(resultSet, i) -> {
					UUID id_user = UUID.fromString(resultSet.getString("id_user"));
					Gender gender_user = (Gender) resultSet.getObject("gender_user");
					String first_name_user = resultSet.getString("first_name_user");
					String last_name_user = resultSet.getString("last_name_user");
					int age_user = resultSet.getInt("age_user");
					String email_user = resultSet.getString("email_user");
					String occupation_user = resultSet.getString("occupation_user");
					Privilege privilege_user = (Privilege) resultSet.getObject("privilege_user");
					return new User(
						id_user, 
						gender_user, 
						first_name_user, 
						last_name_user, 
						age_user, 
						email_user, 
						occupation_user, 
						privilege_user
					);
				}
			);
		return Optional.ofNullable(user);
	}

	@Override
	public boolean deleteUserById(UUID idUser) {
		return false;
	}

	@Override
	public boolean updateUserById(UUID idUser, User user) {
		return false;
	}
}
