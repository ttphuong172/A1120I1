package com.example.casestudy.config;


import com.example.casestudy.dao.TaiKhoanRepository;
import com.example.casestudy.model.TaiKhoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TaiKhoan taiKhoan = taiKhoanRepository.findByUsername(username);
        System.out.println(taiKhoan);
//            TaiKhoan taiKhoan=new TaiKhoan("admin","$2a$12$eIiN48JGZKahvUoG7EN5BeXzeYB3QGQsZN3B1OD/MivkPB8vrWOL.",true);
//            User user=new  User("admin","$2a$12$eIiN48JGZKahvUoG7EN5BeXzeYB3QGQsZN3B1OD/MivkPB8vrWOL.",false,true,true,true,new ArrayList<>());
//            UserDetails userDetails= User.withUsername(taiKhoan.getUsername()).password(taiKhoan.getPassword()).disabled(taiKhoan.isEnabled()).authorities("ROLE_ADMIN","ROLE_USER").build();
        return new MyUserDetails(taiKhoan);

    }
}
